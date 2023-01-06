package com.langhidev.exercicios;

public class Usuario {
    public static void main(String[] args) {
        SmartTV TvDoJorgin = new SmartTV();
        
        TvDoJorgin.ligarOuDesligar(); //Ligando

        System.out.println("TV Ligada? "+TvDoJorgin.ligada);

        TvDoJorgin.alterarVolume(false);
        System.out.println("Volume: "+TvDoJorgin.volume);

        TvDoJorgin.alterarCanal(true);
        System.out.println("Canal: "+TvDoJorgin.canal);

        TvDoJorgin.alterarCanal(525);
        System.out.println("Canal: "+TvDoJorgin.canal);

        TvDoJorgin.ligarOuDesligar(); //Desligando

        System.out.println("TV Ligada? "+TvDoJorgin.ligada);
    }
}
