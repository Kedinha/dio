package edu.kedma.desafio.dominio;

public class Curso extends Conteudo {
    

    private int cargaHoraria;
    
    
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    
    public Curso() {
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "{" +
            " descricao='" + getDescricao() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }
    
}
