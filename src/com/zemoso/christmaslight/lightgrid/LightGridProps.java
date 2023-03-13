package com.zemoso.christmaslight.lightgrid;

public class LightGridProps implements LightGridPropsInterface {

    @Override
    public int getNumberOfLightsSwitchedOn(int size,int[][] lightGridMatrix) {
        int lightsSwitchedOn=0;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(lightGridMatrix[i][j]==1) lightsSwitchedOn++;
            }
        }

        return lightsSwitchedOn;
    }

    @Override
    public int getBrightnessOfLightGrid(int size, int[][] lightGridMatrix) {
        return 0;
    }
}
