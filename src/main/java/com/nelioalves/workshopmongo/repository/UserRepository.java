package com.nelioalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.User;

@Repository
//parametros: tipo da classe de dominio e tipo do ID da classe
public interface UserRepository extends MongoRepository<User, String>{

}
