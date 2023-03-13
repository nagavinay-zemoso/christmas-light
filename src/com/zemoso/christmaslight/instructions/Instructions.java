package com.zemoso.christmaslight.instructions;

import com.zemoso.christmaslight.brightnesslightgrid.BrightnessLightGrid;
import com.zemoso.christmaslight.lightgrid.LightGrid;

public class Instructions implements InstructionsInterface {
    private final LightGrid lightGrid=new LightGrid();
    private final BrightnessLightGrid brightnessLightGrid=new BrightnessLightGrid();
    @Override
    public void executeWinningLightPattern() {
        lightGrid.turnOn(887,9,959,629);
        lightGrid.turnOn(454,398,844,448);
        lightGrid.turnOff(539,243,559,965);
        lightGrid.turnOff(370,819,676,868);
        lightGrid.turnOff(145,40,370,997);
        lightGrid.turnOff(301,3,808,453);
        lightGrid.turnOn(351,678,951,908);
        lightGrid.toggle(720,196,897,994);
        lightGrid.toggle(831,394,904,860);
        lightGrid.show();
    }

    @Override
    public void executeBrightnessLightPattern() {
        brightnessLightGrid.turnOn(887,9,959,629);
        brightnessLightGrid.turnOn(454,398,844,448);
        brightnessLightGrid.turnOff(539,243,559,965);
        brightnessLightGrid.turnOff(370,819,676,868);
        brightnessLightGrid.turnOff(145,40,370,997);
        brightnessLightGrid.turnOff(301,3,808,453);
        brightnessLightGrid.turnOn(351,678,951,908);
        brightnessLightGrid.toggle(720,196,897,994);
        brightnessLightGrid.toggle(831,394,904,860);
        brightnessLightGrid.show();
    }
}
