package za.co.mmagon.jwebswing.plugins.bootstraptoggle;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;

class BSToggleTest
		extends BaseTestClass
{

	@Test
	void setOnText()
	{
		BSToggle toggle = new BSToggle();
		toggle.setOnText("On Text");
		toggle.setOnText("On Text");
		toggle.setOffText("Off Text");
		toggle.setOnStyle(BSButtonOptions.Btn_Danger);
		toggle.setOffStyle(BSButtonOptions.Btn_Outline_Success);
		System.out.println(toggle.toString(0));
	}
}
