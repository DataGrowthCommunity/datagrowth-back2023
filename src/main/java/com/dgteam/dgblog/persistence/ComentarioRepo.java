package com.dgteam.dgblog.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgteam.dgblog.domain.entity.Comentario;

@Repository
public class ComentarioRepo  {
	
	@Autowired
	private IComentarioRepo iComentarioRepo;
	
	public Comentario guardar(Comentario comentario) {
		return iComentarioRepo.save(comentario);
	}
	
	
}
