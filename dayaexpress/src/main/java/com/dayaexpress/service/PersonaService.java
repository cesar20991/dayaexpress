package com.dayaexpress.service;

import javax.servlet.http.HttpSession;

import com.dayaexpress.form.PersonaBean;
import com.dayaexpress.model.Profile;

public interface PersonaService {
	public PersonaBean getInformationPerfil(HttpSession request);
	public boolean editInformacionPerfil(PersonaBean perbean,HttpSession session);
}
