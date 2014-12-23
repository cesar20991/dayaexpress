package com.savmepap.service;

import javax.servlet.http.HttpSession;

import com.savmepap.bean.PersonaBean;
import com.savmepap.model.User;

public interface UsuarioService {

	boolean login(User usu, HttpSession session);
	boolean registro(PersonaBean repb);
}
