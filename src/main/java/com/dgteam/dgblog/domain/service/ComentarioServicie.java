package com.dgteam.dgblog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgteam.dgblog.domain.entity.Comentario;
import com.dgteam.dgblog.persistence.ComentarioRepo;

@Service
public class ComentarioServicie {
	
	@Autowired
	private ComentarioRepo comentarioRepo;
	
	public Comentario save(Comentario comentario) {
		
		return comentarioRepo.guardar(comentario);
		
	}

}
