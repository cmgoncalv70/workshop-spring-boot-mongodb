package com.nelioalves.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.Post;

@Repository
//parametros: tipo da classe de dominio e tipo do ID da classe
public interface PostRepository extends MongoRepository<Post, String> {
	
	//?0 significa primeiro parametro que vier no método (nesse caso, text). Se fosse o segundo, seria ?1
	//A letra i significa ignore case
	@Query("{ title: { $regex: ?0, $options: 'i' } }")
	
	List<Post> searchTitle(String text);	
	
	List<Post> findByTitleContainingIgnoreCase(String text);	//opcao para pesquisar maiusculo e minusculo
}
