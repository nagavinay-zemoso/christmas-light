package com.zemoso.christmaslight.toggleswitch;

public class ToggleSwitch implements ToggleSwitchInterface {

    @Override
    public void toggle(int turnStatus, int[][] lightGridMatrix, int xStart, int yStart, int xDestination, int yDestination) {
        if(turnStatus==0 || turnStatus ==1){
            for(int i=xStart;i<=xDestination;i++){
                for(int j=yStart;j<=yDestination;j++){
                    lightGridMatrix[i][j]=turnStatus;
                }
            }
        }
        else if(turnStatus==-1){
            for(int i=xStart;i<=xDestination;i++){
                for(int j=yStart;j<=yDestination;j++){
                    lightGridMatrix[i][j]=lightGridMatrix[i][j]==0?1:0;
                }
            }
        }
        else{
            System.out.println("given invalid turn status");
        }
    }
}
