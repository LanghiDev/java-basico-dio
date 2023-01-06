package com.langhidev.exercicios;

public class SmartTV {
    
    boolean ligada = false;
    int canal = 0;
    int volume = 25;

    public void ligarOuDesligar(){
        ligada = !ligada;
    }
    public void alterarVolume(boolean aumOuDim){
        volume = aumOuDim ? ++volume : --volume;
    }
    public void alterarCanal(boolean aumOuDim){
        canal = aumOuDim ? ++canal : --canal;
    }
    public void alterarCanal(int num){
        canal = num;
    }

}
