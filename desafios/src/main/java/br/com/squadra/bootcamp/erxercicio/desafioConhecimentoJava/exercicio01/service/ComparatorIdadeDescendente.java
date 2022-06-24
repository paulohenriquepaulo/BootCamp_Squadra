package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio01.service;

import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio01.dto.PessoaDTO;

import java.util.Comparator;

public class ComparatorIdadeDescendente implements Comparator<PessoaDTO> {

    @Override
    public int compare(PessoaDTO pessoa1, PessoaDTO pessoa2) {
        return pessoa2.getIdade() - pessoa1.getIdade();
    }
}
