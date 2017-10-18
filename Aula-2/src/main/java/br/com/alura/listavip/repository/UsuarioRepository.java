package br.com.alura.listavip.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavip.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	Usuario findByNameAndSenha(String name, String senha);

}
