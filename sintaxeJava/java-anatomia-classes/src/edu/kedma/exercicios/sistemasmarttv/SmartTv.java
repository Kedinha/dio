package edu.kedma.exercicios.sistemasmarttv;

public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando + volume: " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo - volume: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void subirCanal(){
        canal ++;
        System.out.println("Mudar canal para + " + canal);
    }
    public void descerCanal(){
        canal --;
        System.out.println("Mudando de canal - " + canal);
    }
 
    
    public void desligar() {
        ligada = false;
    }
    

}
