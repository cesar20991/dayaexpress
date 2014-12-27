package com.dayaexpress.service;

import javax.servlet.http.HttpSession;

import com.dayaexpress.form.PersonaBean;
import com.dayaexpress.model.User;

public interface UsuarioService {

	boolean login(User usu, HttpSession session);
	boolean registro(PersonaBean repb);
}
