package com.dgteam.dgblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgteam.dgblog.domain.entity.Comentario;
import com.dgteam.dgblog.domain.service.ComentarioServicie;

@RestController
@RequestMapping("/api")
public class ComentarioController {
	
	@Autowired
	private ComentarioServicie comentarioService;
	
	@PostMapping("/comentario") 
	public ResponseEntity<Comentario> guardar(@RequestBody Comentario comentario){
		
        Comentario saveComentario = comentarioService.save(comentario);
        
        if (saveComentario != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(saveComentario);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }		
		
	}
	
	
	
	
	

}
