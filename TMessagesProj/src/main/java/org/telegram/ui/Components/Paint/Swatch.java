/*
 * Copyright (C) 2019-2024 qwq233 <qwq233@qwq2333.top>
 * https://github.com/qwq233/Nullgram
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this software.
 *  If not, see
 * <https://www.gnu.org/licenses/>
 */

package org.telegram.ui.Components.Paint;

public class Swatch {

    public int color;
    public float colorLocation;
    public float brushWeight;

    public Swatch(int color, float colorLocation, float brushWeight) {
        this.color = color;
        this.colorLocation = colorLocation;
        this.brushWeight = brushWeight;
    }

    public Swatch clone() {
        return new Swatch(color, colorLocation, brushWeight);
    }
}
