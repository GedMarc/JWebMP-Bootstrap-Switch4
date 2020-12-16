package com.jwebmp.plugins.bs4.toggle.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BS4SwitchInclusionModule implements IGuiceScanModuleInclusions<BS4SwitchInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bs4.toggle");
		return set;
	}
}
