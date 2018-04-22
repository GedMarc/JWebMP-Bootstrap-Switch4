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

import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import org.junit.jupiter.api.Test;

class BSToggleTest

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
