package com.zemoso.christmaslight.brightnesslightgrid;

import com.zemoso.christmaslight.lightgrid.LightGridPropsInterface;

public class BrightnessLightGridProps implements LightGridPropsInterface {
    @Override
    public int getNumberOfLightsSwitchedOn(int size, int[][] lightGridMatrix) {
        return 0;
    }

    @Override
    public int getBrightnessOfLightGrid(int size, int[][] lightGridMatrix) {
        int brightness=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                brightness+=lightGridMatrix[i][j];
            }
        }

        return brightness;
    }
}
