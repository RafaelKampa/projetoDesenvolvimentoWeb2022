package com.br.projetoFinal.service;

import com.br.projetoFinal.dto.ServicoDto;
import com.br.projetoFinal.entity.Servico;
import com.br.projetoFinal.util.excecao.ExcecaoExemplo;

import javax.transaction.SystemException;
import java.util.List;

public interface ServicoService {
    void salvarNovoServico(ServicoDto servicoDto) throws ExcecaoExemplo, SystemException;
    List<Servico> listar();
    Servico buscarPorId(Integer id);
    List<Servico> buscarPorServico(String tipoServico);
    void excluir(Integer id);
}