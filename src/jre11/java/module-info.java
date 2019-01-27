module com.jwebmp.plugins.bootstrap.switch4 {
	exports com.jwebmp.plugins.bootstrap.switch4;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bootstrap.switch4.BSSwitch4PageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.bootstrap.switch4.BSSwitch4AngularModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bootstrap.switch4.implementations.BootstrapSwitch4ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bootstrap.switch4.implementations.BootstrapSwitch4ExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.switch4 to com.fasterxml.jackson.databind, com.jwebmp.core;
}
