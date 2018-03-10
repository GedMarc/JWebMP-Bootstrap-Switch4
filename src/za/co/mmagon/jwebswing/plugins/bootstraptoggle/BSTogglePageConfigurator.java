package za.co.mmagon.jwebswing.plugins.bootstraptoggle;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Bootstrap Switch",
		pluginDescription = "Turn checkboxes    and radio buttons    into toggle switches  ",
		pluginUniqueName = "jwebswing-bootstrap-switch",
		pluginVersion = "3.3.4",
		pluginCategories = "toggle, radio button, checkbox, bootstrap, ui,web ui, framework",
		pluginSubtitle = "Turn checkboxes    and radio buttons    into toggle switches  ",
		pluginSourceUrl = "https://github.com/Bttstrp/bootstrap-switch/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Switch/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Bootstrap-Switch",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://bootstrapswitch.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapSwitch.jar/download") class
BSTogglePageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new BootstrapSwitchPageConfigurator
	 */
	public BSTogglePageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getAngular()
			    .getAngularModules()
			    .add(new BSToggleAngularModule());

			page.getBody()
			    .addJavaScriptReference(BSToggleReferencePool.BootstrapSwitch.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BSToggleReferencePool.BootstrapSwitch.getCssReference());
			page.getBody()
			    .addCssReference(BSToggleReferencePool.BSToggleCustomStyles.getCssReference());
		}
		return page;
	}
}
