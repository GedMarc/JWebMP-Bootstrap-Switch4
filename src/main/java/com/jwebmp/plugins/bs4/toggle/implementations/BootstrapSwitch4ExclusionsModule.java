package com.jwebmp.plugins.bs4.toggle.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BootstrapSwitch4ExclusionsModule
		implements IGuiceScanModuleExclusions<BootstrapSwitch4ExclusionsModule>,
				           IGuiceScanJarExclusions<BootstrapSwitch4ExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-switch4-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstrap.switch4");
		return strings;
	}
}
