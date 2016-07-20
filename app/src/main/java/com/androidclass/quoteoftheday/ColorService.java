package com.androidclass.quoteoftheday;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by jsingh on 7/19/16.
 */
public class ColorService {

    private Random rnd = new Random();


    public int getColor() {
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

    }
}
