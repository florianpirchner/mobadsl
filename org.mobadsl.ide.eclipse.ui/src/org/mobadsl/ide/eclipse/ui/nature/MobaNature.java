package org.mobadsl.ide.eclipse.ui.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.mobadsl.ide.eclipse.CoreUtil;

public class MobaNature implements IProjectNature {

	public static String NATURE_ID = CoreUtil.NATURE_ID;

	private IProject project;

	public void configure() throws CoreException {
//		IProjectDescription desc = project.getDescription();
//		ICommand[] commands = desc.getBuildSpec();
//
//		ICommand[] newCommands = new ICommand[commands.length + 1];
//		System.arraycopy(commands, 0, newCommands, 1, commands.length);
//		ICommand command = desc.newCommand();
//		command.setBuilderName(MobaBuilder.BUILDER_ID);
//		newCommands[0] = command;
//		desc.setBuildSpec(newCommands);
//		project.setDescription(desc, null);
	}

	public void deconfigure() throws CoreException {
//		IProjectDescription description = getProject().getDescription();
//		ICommand[] commands = description.getBuildSpec();
//		for (int i = 0; i < commands.length; ++i) {
//			if (commands[i].getBuilderName().equals(LuniferaBuilder.BUILDER_ID)) {
//				ICommand[] newCommands = new ICommand[commands.length - 1];
//				System.arraycopy(commands, 0, newCommands, 0, i);
//				System.arraycopy(commands, i + 1, newCommands, i,
//						commands.length - i - 1);
//				description.setBuildSpec(newCommands);
//				project.setDescription(description, null);
//				return;
//			}
//		}
	}

	public IProject getProject() {
		return project;
	}

	public void setProject(IProject project) {
		this.project = project;
	}

}