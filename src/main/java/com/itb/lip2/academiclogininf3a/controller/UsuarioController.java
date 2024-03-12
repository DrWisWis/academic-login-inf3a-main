package com.itb.lip2.academiclogininf3a.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.lip2.academiclogininf3a.model.Usuario;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
	
	
	@GetMapping("/users")
	public List<Usuario> getUsers() {
		
		List<Usuario> usuario = new ArrayList<Usuario>();
		
		Usuario us1 = new Usuario();
		us1.setId(1l);
		us1.setNome("Igor Ibiapino");
		us1.setEmail("ibiapinoigor@gmail.com");
		
		usuario.add(us1);
		
		Usuario us2 = new Usuario();
		us2.setId(2l);
		us2.setNome("Emilly Emiliano");
		us2.setEmail("Emiliano@gmail.com");
		
		usuario.add(us2);
		
		return usuario;
		
	}

}
