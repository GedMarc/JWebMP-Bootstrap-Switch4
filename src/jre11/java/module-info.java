import com.jwebmp.plugins.bs4.toggle.implementations.BS4SwitchInclusionModule;

module com.jwebmp.plugins.bs4.toggle {
	exports com.jwebmp.plugins.bs4.toggle;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires com.jwebmp.plugins.bootstrap4;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angular;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.toggle.BSSwitch4PageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.bs4.toggle.BSSwitch4AngularModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.toggle.implementations.BootstrapSwitch4ExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BS4SwitchInclusionModule;
	
	opens com.jwebmp.plugins.bs4.toggle to com.fasterxml.jackson.databind, com.jwebmp.core;
}
