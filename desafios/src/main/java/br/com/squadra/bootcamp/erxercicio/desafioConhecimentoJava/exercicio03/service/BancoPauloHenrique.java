package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.service;

import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.dto.ClienteDTO;

import java.util.ArrayList;
import java.util.List;

public class BancoPauloHenrique implements FilaDeBanco {

    private List<ClienteDTO> filaDeRico;
    private List<ClienteDTO> filaDeMuitoIdoso;
    private List<ClienteDTO> filaDeIdoso;
    private List<ClienteDTO> filaNormal;

    public BancoPauloHenrique() {
        filaDeRico = new ArrayList<>();
        filaDeMuitoIdoso = new ArrayList<>();
        filaDeIdoso = new ArrayList<>();
        filaNormal = new ArrayList<>();

    }

    @Override
    public void adicionarPessoa(ClienteDTO clienteDTO) {

        if (clienteDTO.getSalario() > 50000) {
            System.out.println("Fila de Rico");
            filaDeRico.add(clienteDTO);
        } else if (clienteDTO.getIdade() > 85) {
            System.out.println("Fila de muito idoso");
            filaDeMuitoIdoso.add(clienteDTO);
        } else if (clienteDTO.getIdade() > 60) {
            System.out.println("Fila de idoso");
            filaDeIdoso.add(clienteDTO);
        } else {
            System.out.println("Fila normal");
            filaNormal.add(clienteDTO);
        }
    }

    @Override
    public ClienteDTO atenderPessoa() {
        ClienteDTO clienteDTO = new ClienteDTO();

        if (!filaDeRico.isEmpty()) {
            System.out.println("Fila de Rico");
            clienteDTO = filaDeRico.remove(0);

        } else if (!filaDeMuitoIdoso.isEmpty()) {
            System.out.println("Fila de muito idoso");
            clienteDTO = filaDeMuitoIdoso.remove(0);

        } else if (!filaDeIdoso.isEmpty()) {
            System.out.println("Fila de idoso");
            clienteDTO = filaDeIdoso.remove(0);

        } else if (!filaNormal.isEmpty()) {
            System.out.println("Fila normal");
            clienteDTO = filaNormal.remove(0);

        } else {
            clienteDTO = null;
        }

        return clienteDTO;
    }

    @Override
    public int getTamanhoFila() {
        return filaDeRico.size() + filaDeMuitoIdoso.size() + filaDeIdoso.size() + filaNormal.size();
    }


}
