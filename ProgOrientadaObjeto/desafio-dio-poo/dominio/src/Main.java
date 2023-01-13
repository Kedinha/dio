import java.time.LocalDate;

import edu.kedma.desafio.dominio.Bootcamp;
import edu.kedma.desafio.dominio.Conteudo;
import edu.kedma.desafio.dominio.Curso;
import edu.kedma.desafio.dominio.Dev;
import edu.kedma.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("descrição do curso de JS");
        curso2.setCargaHoraria(4);
                
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Titulo Mentoria Java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());
        
        /*  System.out.println(curso1);
        *System.out.println(curso2);
        *System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(conteudo);
        bootcamp.getConteudos().add(conteudo1);


        Dev devKedma = new Dev();
        devKedma.setNome("Kédma");
        devKedma.inscreverBootcamp(bootcamp);
        System.out.println("\tConteúdos Inscritos Kédma" + devKedma.getConteudosInscritos());

        devKedma.progredir();
        devKedma.progredir();
        System.out.println("-");
        System.out.println("\tConteúdos Inscritos Kédma" + devKedma.getConteudosInscritos());        
        System.out.println("\tConteúdos Concluídos Kédma" + devKedma.getConteudosConcluidos());
        System.out.println("\tXP: "+ devKedma.calcularTotalXP());

        System.out.println("------------------");
        
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("\tXP: "+ devCamila.calcularTotalXP());

    }
}
