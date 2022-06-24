package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio02.dto;

public class AlunoDTO implements Comparable<AlunoDTO> {

    private String nome;
    private Integer idade;
    private Double nota;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int compareTo(AlunoDTO o) {
        int resultado = o.getNota().compareTo(this.getNota());
        if (resultado == 0) {
            resultado = o.getIdade().compareTo(this.getIdade());
        }

        return resultado;
    }


    @Override
    public String toString() {
        return  nome +
                "\t- " + idade +
                " - \t" + nota +
                " - ";
    }
}
