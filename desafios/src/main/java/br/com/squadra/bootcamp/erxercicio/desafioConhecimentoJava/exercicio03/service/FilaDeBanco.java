package br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.service;

import br.com.squadra.bootcamp.erxercicio.desafioConhecimentoJava.exercicio03.dto.ClienteDTO;

public interface FilaDeBanco {

    public void adicionarPessoa(ClienteDTO pessoaVo);
    public ClienteDTO atenderPessoa();
    public int getTamanhoFila();


}
