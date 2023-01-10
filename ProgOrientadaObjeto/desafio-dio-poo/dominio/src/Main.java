import java.time.LocalDate;

import edu.kedma.desafio.dominio.Conteudo;
import edu.kedma.desafio.dominio.Curso;
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
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        
    }
}
