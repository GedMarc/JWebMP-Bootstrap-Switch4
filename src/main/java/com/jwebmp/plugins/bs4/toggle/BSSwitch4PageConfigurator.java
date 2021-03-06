package com.jwebmp.plugins.bs4.toggle;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Switch",
		pluginDescription = "Turn checkboxes    and radio buttons    into toggle switches  ",
		pluginUniqueName = "bootstrap-switch",
		pluginVersion = "0.3.4",
		pluginCategories = "toggle, radio button, checkbox, bootstrap, ui,web ui, framework",
		pluginSubtitle = "Turn checkboxes    and radio buttons    into toggle switches  ",
		pluginSourceUrl = "https://github.com/Bttstrp/bootstrap-switch/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Bootstrap-Switch/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Bootstrap-Switch",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://bootstrapswitch.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.bootstrap/jwebmp-bootstrap-toggle",
		pluginGroupId = "com.jwebmp.plugins.bootstrap",
		pluginArtifactId = "jwebmp-bootstrap-toggle",
		pluginModuleName = "com.jwebmp.plugins.bs4.toggle",
		pluginStatus = PluginStatus.Released
)
public class BSSwitch4PageConfigurator
		implements IPageConfigurator<BSSwitch4PageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	
	/*
	 * Constructs a new BootstrapSwitchPageConfigurator
	 */
	public BSSwitch4PageConfigurator()
	{
		//Nothing needed
	}
	
	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BSSwitch4PageConfigurator.enabled;
	}
	
	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BSSwitch4PageConfigurator.enabled = mustEnable;
	}
	
	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BSSwitch4ReferencePool.BootstrapSwitch.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BSSwitch4ReferencePool.BootstrapSwitch.getCssReference());
			page.getBody()
			    .addCssReference(BSSwitch4ReferencePool.BSToggleCustomStyles.getCssReference());
		}
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return BSSwitch4PageConfigurator.enabled;
	}
}
