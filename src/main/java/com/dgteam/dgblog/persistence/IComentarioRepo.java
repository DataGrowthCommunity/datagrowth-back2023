package com.dgteam.dgblog.persistence;

import org.springframework.data.repository.CrudRepository;

import com.dgteam.dgblog.domain.entity.Comentario;

public interface IComentarioRepo extends CrudRepository<Comentario, Integer> {

}
