module com.jwebmp.plugins.bs4.toggle {
	exports com.jwebmp.plugins.bs4.toggle;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.toggle.BSSwitch4PageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.bs4.toggle.BSSwitch4AngularModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.toggle.implementations.BootstrapSwitch4ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4.toggle.implementations.BootstrapSwitch4ExclusionsModule;

	opens com.jwebmp.plugins.bs4.toggle to com.fasterxml.jackson.databind, com.jwebmp.core;
}
