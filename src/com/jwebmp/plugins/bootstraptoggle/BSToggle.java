/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bootstraptoggle;

import com.jwebmp.base.angular.AngularAttributes;
import com.jwebmp.base.html.DivSimple;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions;

import javax.validation.constraints.NotNull;

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
		addClass(BSFormGroupOptions.Form_Control);

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
