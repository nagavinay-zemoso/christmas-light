package com.zemoso.christmaslight.lightgrid;

import com.zemoso.christmaslight.toggleswitch.ToggleSwitch;

public class LightGrid implements LightGridInterface{

    private final int size = 1000;
    private final int[][] lightGridMatrix =new int[size][size];
    private final LightGridProps lightGridProps=new LightGridProps();
    private final ToggleSwitch toggleSwitch=new ToggleSwitch();

    @Override
    public void turnOn(int xStart, int yStart, int xDestination, int yDestination) {
        toggleSwitch.toggle(1, lightGridMatrix,xStart,yStart,xDestination,yDestination);
    }

    @Override
    public void turnOff(int xStart, int yStart, int xDestination, int yDestination) {
        toggleSwitch.toggle(0, lightGridMatrix,xStart,yStart,xDestination,yDestination);
    }

    @Override
    public void toggle(int xStart, int yStart, int xDestination, int yDestination) {
        toggleSwitch.toggle(-1, lightGridMatrix,xStart,yStart,xDestination,yDestination);
    }

    @Override
    public void show() {
        System.out.println(lightGridProps.getNumberOfLightsSwitchedOn(size,lightGridMatrix));
    }
}
