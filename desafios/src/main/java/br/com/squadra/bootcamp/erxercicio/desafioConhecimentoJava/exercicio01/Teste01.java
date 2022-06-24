package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio01;

import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio01.dto.PessoaDTO;
import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio01.service.ComparatorIdadeDescendente;

import java.util.*;

public class Teste01 {

    public static void main(String[] args) {
        List<PessoaDTO> list = new ArrayList<>();
        ComparatorIdadeDescendente comparator = new ComparatorIdadeDescendente();
        for (int i = 0; i < 5; i++) {
            PessoaDTO pessoaDTO = new PessoaDTO();
            pessoaDTO.setNome("Nome pessoa ".concat(String.valueOf(i + 1)));
            pessoaDTO.setSobrenome("Sobrenome pessoa ".concat(String.valueOf(i + 1)));
            pessoaDTO.setIdade(new Random().nextInt(100));
            list.add(pessoaDTO);
        }
        Collections.sort(list, comparator);
        for (PessoaDTO p : list) {
            System.out.println(p);
        }
    }

}
