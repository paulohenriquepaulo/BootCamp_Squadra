package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03;

import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.dto.ClienteDTO;
import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.service.BancoPauloHenrique;

import java.util.Random;

public class Teste03 {
    public static void main(String[] args) {

        BancoPauloHenrique banco = new BancoPauloHenrique();
        int x = 0;
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setNome("Nome pessoa ".concat(String.valueOf(i + 1)));
            clienteDTO.setIdade(gerador.nextInt(100));
            clienteDTO.setSalario(Double.valueOf(gerador.nextInt(20000)));
            System.out.println(clienteDTO);
            banco.adicionarPessoa(clienteDTO);
            System.out.println("--------------------------------------------------");
        }

        while (x < 10) {
            System.out.println("\n\nTamanho da fila: " + banco.getTamanhoFila());
            System.out.println(banco.atenderPessoa());
            System.out.println("--------------------------------------------------");
            x++;
        }


    }
}
