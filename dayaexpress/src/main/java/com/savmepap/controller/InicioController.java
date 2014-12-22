package com.savmepap.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.savmepap.bean.PersonaBean;
import com.savmepap.model.Usuario;
import com.savmepap.service.PersonaService;
import com.savmepap.service.UsuarioService;

@Controller
public class InicioController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	PersonaService personaService;
	
	@RequestMapping("toLogin")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("toRegistro")
	public String toRegistro() {
		return "registroA";
	}
	
	@RequestMapping(value = "/toDashboard", method = RequestMethod.GET)
	public String toDashboard(HttpServletRequest req, HttpSession session, Model model){
		String path = "";
		
		model.addAttribute("nameUser", req.getSession().getAttribute("email"));
		path = "dashboard";

			
		return path;		
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String login(@ModelAttribute("usuario") Usuario usu, Model model, HttpServletRequest req, HttpSession session){
		String path = "";
		if(usuarioService.login(usu, req.getSession())) {
			model.addAttribute("nameUser", req.getSession().getAttribute("email"));
			path = "dashboard";
		}else{
			model.addAttribute("msg", "El usuario no esta habilitado");
			path = "login";
		}
		return path;
	}
	
	@RequestMapping(value = "toLogout", method = RequestMethod.GET)
	public String toLogout(HttpSession session, Model model){
		System.out.println("Index Controller.toLogout");
		session.invalidate();
		model.addAttribute("msg", "Usted ha salido del sistema");
		return "login";
	}
	
	@RequestMapping("toPerfil")
	public String toPerfil() {
		return "empMiPerfil";
	}
	
	@RequestMapping(value = "getInformacionPerfil", method = RequestMethod.POST)
	@ResponseBody
	public PersonaBean getInformationPerfil(HttpServletRequest request){		
		return personaService.getInformationPerfil(request.getSession());
	}
	
	@RequestMapping(value = "ajaxEditInformacionPerfil", method = RequestMethod.POST)
	@ResponseBody
	public PersonaBean getEditInformationPerfil(@ModelAttribute PersonaBean perbean, HttpServletRequest request){
		
		PersonaBean personabean = new PersonaBean();
		
		if(personaService.editInformacionPerfil(perbean,request.getSession())){
			personabean = personaService.getInformationPerfil(request.getSession());
		}else{
			personabean = null;
		}
		
		return personabean;
	}
	
	@RequestMapping(value="registro", method = RequestMethod.POST)
	public String registro(@ModelAttribute("personabean") PersonaBean persb, Model model, HttpServletRequest req){
		String path = "";
		if(usuarioService.registro(persb)){
			path = "login";
			model.addAttribute("msg", "Usted puede entrar al sistema");
		}else{
			model.addAttribute("msg", "Fallo al registrarse");
			path = "registroA";
		}
		return path;
	}
}
