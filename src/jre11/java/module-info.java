import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrap.switch4.BSSwitch4AngularModule;
import com.jwebmp.plugins.bootstrap.switch4.BSSwitch4PageConfigurator;
import com.jwebmp.plugins.bootstrap.switch4.implementations.BootstrapSwitch4ExclusionsModule;

module com.jwebmp.plugins.bootstrap.switch4 {
	exports com.jwebmp.plugins.bootstrap.switch4;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BSSwitch4PageConfigurator;
	provides IAngularModule with BSSwitch4AngularModule;

	provides IGuiceScanModuleExclusions with BootstrapSwitch4ExclusionsModule;
	provides IGuiceScanJarExclusions with BootstrapSwitch4ExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.switch4 to com.fasterxml.jackson.databind, com.jwebmp.core;
}
