package br.com.alura.listavip.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavip.model.Perguntas;

public interface PerguntasRepository extends CrudRepository<Perguntas, Integer> {
	
	
}
