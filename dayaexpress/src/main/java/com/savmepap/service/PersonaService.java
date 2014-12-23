package com.savmepap.service;

import javax.servlet.http.HttpSession;

import com.savmepap.bean.PersonaBean;
import com.savmepap.model.Profile;

public interface PersonaService {
	public PersonaBean getInformationPerfil(HttpSession request);
	public boolean editInformacionPerfil(PersonaBean perbean,HttpSession session);
}
