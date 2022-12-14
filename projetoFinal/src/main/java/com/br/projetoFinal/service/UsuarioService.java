package com.br.projetoFinal.service;

import com.br.projetoFinal.dto.UsuarioDto;
import com.br.projetoFinal.entity.Usuario;
import com.br.projetoFinal.util.excecao.ExcecaoExemplo;

import javax.transaction.SystemException;
import java.util.List;

public interface UsuarioService {
    void salvarUsuario(UsuarioDto usuarioDto) throws ExcecaoExemplo, SystemException;
    List<Usuario> listar();
    List<Usuario> buscarConferentes();
    List<Usuario> buscarExecutores();
    Usuario buscarPorId(Integer idUsuario);
    Usuario buscarPorNome(String login);
    void excluir(Integer idUsuario);
}
