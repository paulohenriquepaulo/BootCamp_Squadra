package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio02;

import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio02.dto.AlunoDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste02 {

    public static void main(String[] args) {

        List<AlunoDTO> list = new ArrayList<>();
        AlunoDTO aluno1 = new AlunoDTO();
        AlunoDTO aluno2 = new AlunoDTO();
        AlunoDTO aluno3 = new AlunoDTO();
        AlunoDTO aluno4 = new AlunoDTO();
        AlunoDTO aluno5 = new AlunoDTO();

        aluno1.setNome("DANTE DE OLIVEIRA");
        aluno1.setIdade(54);
        aluno1.setNota(8.8);
        aluno1.setCurso("MEDICINA");
        list.add(aluno1);

        aluno2.setNome("MARINA SILVEIRA  ");
        aluno2.setIdade(32);
        aluno2.setNota(8.8);
        aluno2.setCurso("MEDICINA");
        list.add(aluno2);

        aluno3.setNome("AVELINO DE COSTA");
        aluno3.setIdade(32);
        aluno3.setNota(8.7);
        aluno3.setCurso("MEDICINA");
        list.add(aluno3);

        aluno4.setNome("ROBERTO CAMPOS    ");
        aluno4.setIdade(31);
        aluno4.setNota(8.7);
        aluno4.setCurso("MEDICINA");
        list.add(aluno4);

        aluno5.setNome("VIRGÍNIO DAS ALMAS");
        aluno5.setIdade(64);
        aluno5.setNota(8.5);
        aluno5.setCurso("MEDICINA");
        list.add(aluno5);

        Collections.sort(list);

        System.out.println("============ CURSO DE MEDICINA ============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + (i <= 2 ? "APROVADO" : "REPROVADO"));
        }


    }


}
