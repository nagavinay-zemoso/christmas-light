package com.zemoso.christmaslight.brightnesstoggleswitch;


import com.zemoso.christmaslight.toggleswitch.ToggleSwitchInterface;

public class BrightnessToggleSwitch implements ToggleSwitchInterface {

    @Override
    public void toggle(int turnStatus, int[][] lightGridMatrix, int xStart, int yStart, int xDestination, int yDestination) {
        switch (turnStatus) {
            case -1:
                for (int i = xStart; i <= xDestination; i++) {
                    for (int j = yStart; j <= yDestination; j++) {
                        lightGridMatrix[i][j] += 2;
                    }
                }
                break;
            case 0:
                for (int i = xStart; i <= xDestination; i++) {
                    for (int j = yStart; j <= yDestination; j++) {
                        if(lightGridMatrix[i][j]>0)
                            lightGridMatrix[i][j] -= 1;
                    }
                }
                break;
            case 1:
                for (int i = xStart; i <= xDestination; i++) {
                    for (int j = yStart; j <= yDestination; j++) {
                        lightGridMatrix[i][j] += 1;
                    }
                }
                break;
            default:
                System.out.println("given invalid turn status");
                break;
        }
    }
}
