package com.zemoso.christmaslight.lightgrid;

public interface LightGridInterface {

    void turnOn(int xStart, int yStart, int xDestination, int yDestination);
    void turnOff(int xStart, int yStart, int xDestination, int yDestination);
    void toggle(int xStart, int yStart, int xDestination, int yDestination);
    void show();
}
