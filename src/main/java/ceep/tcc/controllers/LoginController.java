package ceep.tcc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/efetuarLogin", method=RequestMethod.GET)
	public String telaLogin() {
		
		return "/telaLogin";
	}
	
	@RequestMapping(value="/efetuarLogin", method=RequestMethod.POST)
	public String autenticacao(@RequestParam("usuario")String user, @RequestParam("senha")String pass) {
		
		String senha = pass;
		String usuario = user;
		
		
		
		System.out.println("Seja Bem-vindo " + usuario + senha);
		
		return "/index";
	}
	
	

}
