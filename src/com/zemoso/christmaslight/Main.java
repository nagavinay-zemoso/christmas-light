package com.zemoso.christmaslight;

import com.zemoso.christmaslight.instructions.Instructions;

public class Main {
    public static void main(String[] args) {
        Instructions instructions=new Instructions();
        instructions.executeWinningLightPattern();
        instructions.executeBrightnessLightPattern();
    }
}