package ceep.tcc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OpcaoCadastroController {
	
	@RequestMapping(value="/opcoesCadastro", method=RequestMethod.GET)
	public String opcoesCadastro() {
		return "/opcoesCadastro";
	}
	

}