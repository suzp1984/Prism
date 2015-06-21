package com.stylingandroid.prism.filter;

import android.graphics.Color;

public class TintFilter extends BaseColourFilter {
    private static final float DEFAULT_TINT_FACTOR = 0.2f;
    private final float tintFactor;

    public TintFilter() {
        this(DEFAULT_TINT_FACTOR);
    }

    public TintFilter(float tintFactor) {
        super();
        this.tintFactor = tintFactor;
    }

    @Override
    public int onFilter(int colour) {
        int red = Color.red(colour);
        int green = Color.green(colour);
        int blue = Color.blue(colour);
        return Color.argb(
                Color.alpha(colour),
                red + (int) ((float) (0xFF - red) * tintFactor),
                green + (int) ((float) (0xFF - green) * tintFactor),
                blue + (int) ((float) (0xFF - blue) * tintFactor));
    }
}