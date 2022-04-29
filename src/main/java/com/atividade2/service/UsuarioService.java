package com.atividade2.service;

import com.atividade2.model.Usuario;
import com.atividade2.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario saveUsuario (Usuario newUsuario){
        newUsuario.setNome(newUsuario.getNome());
        return usuarioRepository.save(newUsuario);
    }

    public void excluir(Long id) {

        usuarioRepository.deleteById(id);
    }

}
