package com.marklogic.ant.tasks;

import org.apache.tools.ant.BuildException;

import com.marklogic.ant.annotation.AntTask;

/**
 * @author Bob Browning <bob.browning@pressassociation.com>
 */
@AntTask("uninstall")
public class UninstallTask extends AbstractUninstallTask {

	@Override
	public void execute() throws BuildException {
		super.execute();
		uninstallAll();
	}
}
