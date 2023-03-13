package com.zemoso.christmaslight.brightnesslightgrid;

import com.zemoso.christmaslight.brightnesstoggleswitch.BrightnessToggleSwitch;
import com.zemoso.christmaslight.lightgrid.LightGridInterface;

public class BrightnessLightGrid implements LightGridInterface {
    private final int size = 1000;
    private final int[][] lightGridMatrix =new int[size][size];
    private final BrightnessLightGridProps brightnessLightGridProps =new BrightnessLightGridProps();
    private final BrightnessToggleSwitch brightnessToggleSwitch =new BrightnessToggleSwitch();
    @Override
    public void turnOn(int xStart, int yStart, int xDestination, int yDestination) {
        brightnessToggleSwitch.toggle(1, lightGridMatrix,xStart,yStart,xDestination,yDestination);
    }

    @Override
    public void turnOff(int xStart, int yStart, int xDestination, int yDestination) {
        brightnessToggleSwitch.toggle(0, lightGridMatrix,xStart,yStart,xDestination,yDestination);
    }

    @Override
    public void toggle(int xStart, int yStart, int xDestination, int yDestination) {
        brightnessToggleSwitch.toggle(-1, lightGridMatrix,xStart,yStart,xDestination,yDestination);
    }

    @Override
    public void show() {
        System.out.println(brightnessLightGridProps.getBrightnessOfLightGrid(size,lightGridMatrix));
    }
}
