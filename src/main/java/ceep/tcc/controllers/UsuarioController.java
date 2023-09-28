package ceep.tcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ceep.tcc.models.Usuario;
import ceep.tcc.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository ur;
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.GET)
	public String cadastroUsuario(){
		
		return "cadastroUsuario";
	}
	
	@PostAuthorize(value = "/cadastrarUsuario")
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.POST)
	private String cadastroUsuario(@RequestParam("name")String nome, @RequestParam("cpf")
	String cpf, @RequestParam("email")String email, @RequestParam("telefone")String telefone,
	@RequestParam("logradouro")String logradouro, @RequestParam("numero")String numero, 
	@RequestParam("cidade")String cidade, @RequestParam("uf")String uf, @RequestParam("senha")String senha,
	@RequestParam("repetirSenha")String repetirSenha, @RequestParam("usuario")String user) {
		
		new BCryptPasswordEncoder().encode(senha);
		new BCryptPasswordEncoder().encode(repetirSenha);
		
		Usuario usuario = new Usuario(null, nome, cpf, email, telefone, logradouro, 
				numero, cidade, uf, user, senha, repetirSenha);
		
		ur.save(usuario);
		
		return "/index";
	}

}
