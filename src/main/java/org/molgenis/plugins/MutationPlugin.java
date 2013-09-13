package org.molgenis.plugins;

import org.molgenis.controller.MutationController;
import org.molgenis.framework.ui.IframePlugin;
import org.molgenis.framework.ui.ScreenController;

public class MutationPlugin extends IframePlugin
{
	private static final long serialVersionUID = 1L;

	public MutationPlugin(String name, ScreenController<?> parent)
	{
		super(name, parent);
	}

	@Override
	public String getIframeSrc()
	{
		return MutationController.URI;
	}
	
}
