package edu.kedma.classes;

public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Citrën");
        carro1.setCapacidadeTanque(45);

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor:" + carro1.getCor());
        System.out.println("Tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor total do tanque cheio: R$" + carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Azul", "Honda", 50); // sobrecarga no método

        /*
         * carro2.setCor("Azul");
         * carro2.setModelo("Honda");
         * carro2.setCapacidadeTanque(50);
         */

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
