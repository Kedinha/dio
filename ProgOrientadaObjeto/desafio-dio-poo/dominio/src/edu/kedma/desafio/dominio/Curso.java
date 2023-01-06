package edu.kedma.desafio.dominio;

public class Curso {
    
    private String descricao;
    private String titulo;
    private int cargaHoraria;


    public Curso() {
    }


    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
