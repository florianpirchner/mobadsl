package org.mobadsl.semantic.model.moba.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.RecursionException;

public class MobaUtil {

	/**
	 * Returns the bounds for the given provider.
	 * 
	 * @param object
	 * @return
	 */
	public static Bounds getBounds(MobaMultiplicityAble object) {
		return Bounds.createFor(object);
	}

	/**
	 * Returns a list with all super types of the given #type. To find the super
	 * type reference, the #superTypeRef is used.
	 * <p>
	 * For <code>a extends b extends c</code> a list in the order
	 * <code>[a, b, c]</code> is returned. The highest super type is located at
	 * the end of the list.
	 * 
	 * @param type
	 * @param superTypeRef
	 * @return
	 */
	public static <T extends EObject> List<T> getAllSuperTypes(T type, EReference superTypeRef) {
		List<T> result = new ArrayList<>();
		doGetAllSuperTypes(type, superTypeRef, result);
		return result;
	}

	protected static <T extends EObject> void doGetAllSuperTypes(T type, EReference superTypeRef, List<T> result) {

		@SuppressWarnings("unchecked")
		T superType = (T) type.eGet(superTypeRef);

		if (superType == null) {
			return;
		}

		if (result.contains(superType)) {
			throw new RecursionException(type, superType);
		}
		result.add(superType);

		doGetAllSuperTypes(superType, superTypeRef, result);
	}

	/**
	 * Returns all features accessible by the featureRef for each type. The
	 * order of the features is the same as the order of the types.
	 * 
	 * @param types
	 * @param clazz
	 * @param featureRef
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> getAllFeatures(List<? extends EObject> types, Class<T> clazz, EReference featureRef) {
		List<T> result = new ArrayList<>();
		for (EObject temp : types) {
			result.addAll(((List<T>) temp.eGet(featureRef)).stream().filter(e -> clazz.isAssignableFrom(e.getClass()))
					.map(e -> (T) e).collect(Collectors.<T> toList()));
		}

		return result;
	}

	/**
	 * Returns the features accessible by the featureRef for the given type.
	 * 
	 * @param types
	 * @param clazz
	 * @param featureRef
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> getAllFeatures(EObject type, Class<T> clazz, EReference featureRef) {
		List<T> result = new ArrayList<>();
		result.addAll(((List<T>) type.eGet(featureRef)).stream().filter(e -> clazz.isAssignableFrom(e.getClass()))
				.map(e -> (T) e).collect(Collectors.<T> toList()));

		return result;
	}

	/**
	 * Returns the generator specific values for the given features.
	 * <p>
	 * The difference to {@link #getAllFeatures(EObject, Class, EReference)} is,
	 * that shadowed values are replaced with their new replaced representation.
	 * <p>
	 * <code>allFeatures = {name=Foo->value=Foo123, name=Baa->value=Baa, name=Foo->value=Foo}</code>
	 * : According to the {@link #getAllFeatures(List, Class, EReference)}
	 * implementation, the order of features are according their super types.
	 * The features of the highest super type are located at the end of the
	 * list. So the first <code>name=Foo</code> is more special than the last
	 * one. And so the second one will become replaced by the first one.<br>
	 * The result list looks like
	 * <code>result = {name=Baa->value=Baa, name=Foo->value=Foo123}</code>
	 * 
	 * @param allFeatures
	 * @param nameAtt
	 * @return
	 */
	public static <T extends EObject> List<T> getGenFeatures(List<T> allFeatures, EStructuralFeature nameAtt) {

		List<T> result = new ArrayList<>(allFeatures);

		// collect all features that need to be removed from the result
		List<T> toBeRemoved = new ArrayList<>();
		for (int i = allFeatures.size() - 1; i >= 0; i--) {
			T feature = allFeatures.get(i);
			// if there is a more special feature in the result, then remove the
			// current one
			int j = indexOfFirstOccurence(result, feature, nameAtt);
			if (j >= 0 && j != i) {
				toBeRemoved.add(feature);
			}
		}

		result.removeAll(toBeRemoved);

		return result;
	}

	private static <T extends EObject> int indexOfFirstOccurence(List<T> result, T feature, EStructuralFeature valueAtt) {
		// get the value of the feature to compare
		Object featureValue = feature.eGet(valueAtt);
		// find the first feature with a matching value
		T firstFeature = result.stream().filter(e -> e.eGet(valueAtt).equals(featureValue)).findFirst().orElse(null);
		// return the index of the first feature
		return result.indexOf(firstFeature);
	}

	public static String toApplicationVersionedId(MobaApplication mobaApplication) {
		return toApplicationVersionedId(mobaApplication.getName(), mobaApplication.getVersion());
	}

	public static String toApplicationVersionedId(String name, String version) {
		return name + ":" + version;
	}

	/**
	 * Converts from <code>template:1.2.3</code> to <code>template.1.2.3</code>
	 * 
	 * @param string
	 * @return
	 */
	public static String toVersionedIdModelValue(String string) {
		if (!string.contains(":")) {
			return string;
		}
		String[] artifactTokens = string.split(":");
		String templateId = artifactTokens[0];
		String[] versionTokens = artifactTokens[1].split("\\.");

		List<String> tokens = new ArrayList<>();
		tokens.add(templateId);
		tokens.addAll(Arrays.asList(versionTokens));

		StringBuilder b = new StringBuilder();
		for (String token : tokens) {
			if (b.length() > 0) {
				b.append(".");
			}
			b.append(token);
		}

		return b.toString();
	}

	/**
	 * Converts from <code>template.1.2.3</code> to <code>template:1.2.3</code>
	 * 
	 * @param string
	 * @return
	 */
	public static String toVersionedIdUiValue(String value) {
		if (value.contains(":")) {
			return value;
		}
		String[] tokens = value.split("\\.");
		StringBuilder b = new StringBuilder();
		int index = -1;
		for (String token : tokens) {
			index++;
			if (b.length() > 0) {
				if (index == 1) {
					b.append(":");
				} else {
					b.append(".");
				}
			}
			b.append(token);
		}

		return b.toString();

	}

	/**
	 * Converts from <code>org.my.generator:0.8.1-SNAPSHOT</code> to
	 * <code>org.my.generator</code>
	 * 
	 * @param string
	 * @return
	 */
	public static String toGeneratorId(String terminalString) {
		if (terminalString == null || !terminalString.contains(":")) {
			return "";
		}
		String[] tokens = terminalString.split(":");
		return tokens[0];

	}
	
	public static String toGeneratorVersionedId(String name, String version) {
		return name + ":" + version;
	}

	/**
	 * Converts from <code>org.my.generator:0.8.1-SNAPSHOT</code> to
	 * <code>0.8.1-SNAPSHOT</code>
	 * 
	 * @param string
	 * @return
	 */
	public static String toGeneratorVersion(String terminalString) {
		if (terminalString == null || !terminalString.contains(":")) {
			return "";
		}
		String[] tokens = terminalString.split(":");
		return tokens[1];
	}

	/**
	 * Converts from <code>org.my.generator</code> and
	 * <code>0.8.1-SNAPSHOT</code> to
	 * <code>org.my.generator : 0.8.1-SNAPSHOT</code>
	 * 
	 * @param string
	 * @return
	 */
	public static String toVersionedIdWithWhitespace(String id, String version) {
		return id + " : " + version;

	}

}
