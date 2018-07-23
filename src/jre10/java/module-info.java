import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstraptoggle.BSToggleAngularModule;
import com.jwebmp.plugins.bootstraptoggle.BSTogglePageConfigurator;

module com.jwebmp.plugins.bootstraptoggle {
	exports com.jwebmp.plugins.bootstraptoggle;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.plugins.bootstrap4;
	requires java.validation;

	provides IPageConfigurator with BSTogglePageConfigurator;
	provides IAngularModule with BSToggleAngularModule;

}
