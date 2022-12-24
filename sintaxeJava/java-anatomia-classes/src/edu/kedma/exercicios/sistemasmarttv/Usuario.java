package edu.kedma.exercicios.sistemasmarttv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv =  new SmartTv();


        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // liga a tv

        smartTv.ligar();
        System.out.println("Novo Status TV Ligada ? " + smartTv.ligada);

        // altera o volume
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        //muda o canal

        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);
        
        
        smartTv.desligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);
        
    }
}
