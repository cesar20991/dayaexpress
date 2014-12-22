package com.savmepap.service;

import javax.servlet.http.HttpSession;

import com.savmepap.bean.PersonaBean;
import com.savmepap.model.Usuario;

public interface UsuarioService {

	boolean login(Usuario usu, HttpSession session);
	boolean registro(PersonaBean repb);
}
