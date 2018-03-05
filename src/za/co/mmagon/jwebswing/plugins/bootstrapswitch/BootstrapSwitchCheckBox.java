package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.BSCheckBox;

import java.util.Objects;

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
public class BootstrapSwitchCheckBox
		extends BSCheckBox<BootstrapSwitchCheckBox>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The feature for this select
	 */
	private BootstrapSwitchFeature feature;

	/*
	 * Constructs a new BootstrapSwitchCheckBox
	 */
	public BootstrapSwitchCheckBox()
	{
		addFeature(getFeature());
		setActive(true);
	}

	/**
	 * Returns the feature for this component
	 *
	 * @return
	 */
	public BootstrapSwitchFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BootstrapSwitchFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this bootstrap drop down
	 *
	 * @param feature
	 *
	 * @return
	 */
	public BootstrapSwitchCheckBox setFeature(BootstrapSwitchFeature feature)
	{
		this.feature = feature;
		return this;
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
		return Objects.hash(super.hashCode(), getFeature());
	}

	@Override
	public BootstrapSwitchOptions getOptions()
	{
		return getFeature().getOptions();
	}
}
