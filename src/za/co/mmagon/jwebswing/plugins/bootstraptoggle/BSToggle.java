package za.co.mmagon.jwebswing.plugins.bootstraptoggle;

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions.Form_Control;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with
 * the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Switch Check Box",
		description = "Turn checkboxes    and radio buttons    into toggle switches  ",
		url = "https://github.com/GedMarc/JWebSwing-Bootstrap-Switch")
public class BSToggle<J extends BSToggle<J>>
		extends DivSimple<J>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new BootstrapSwitchCheckBox
	 */
	public BSToggle()
	{
		setTag("toggle");
	}

	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J bind(String variableName)
	{
		addAttribute(AngularAttributes.ngModel, variableName);
		return (J) this;
	}

	/**
	 * Sets the on text for the component
	 *
	 * @param onText
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnText(String onText)
	{
		addAttribute("on", onText);
		return (J) this;
	}

	/**
	 * Sets the off text for the component
	 *
	 * @param onText
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOffText(String onText)
	{
		addAttribute("off", onText);
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setSize(BSButtonSizeOptions size)
	{
		addAttribute("size", size.toString());
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnStyle(BSButtonOptions buttonStyle)
	{
		addAttribute("onstyle", buttonStyle.toString());
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setOffStyle(BSButtonOptions buttonStyle)
	{
		addAttribute("offstyle", buttonStyle.toString());
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setStyle(String customClass)
	{
		addAttribute("style", customClass);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		super.preConfigure();
		addClass(Form_Control);

	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
