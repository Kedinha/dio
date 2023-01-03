package edu.kedma.polimorfismo.updowncast;

public class RodarAplicacao {
    public static void main(String[] args) {

        //objeto instanciado
        Funcionario funcionario = new Funcionario();


        //UPCASTS - classe Funcionario é super tipo de todas as classes
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        //DOWNCAST evitar aplicar esse conceito
        //Gerente gerente_ = new Funcionario(); * DOWN ERRADO
        // Vendedor vendedor_ = (Vendedor) new Funcionario();
        
    }
}
