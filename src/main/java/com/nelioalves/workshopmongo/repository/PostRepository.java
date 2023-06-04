package com.nelioalves.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.Post;

@Repository
//parametros: tipo da classe de dominio e tipo do ID da classe
public interface PostRepository extends MongoRepository<Post, String> {
	
	//apenas essa linha já é o query method propriamente dito
	//List<Post> findByTitleContaining(String text);
	List<Post> findByTitleContainingIgnoreCase(String text);	//opcao para pesquisar maiusculo e minusculo
}
