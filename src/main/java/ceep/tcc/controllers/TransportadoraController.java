package ceep.tcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ceep.tcc.models.Transportadora;
import ceep.tcc.repository.TransportadoraRepository;

@Controller
public class TransportadoraController {

	@Autowired
	private TransportadoraRepository tr;
	
	
	@RequestMapping(value = "/cadastrarTransportadora", method = RequestMethod.GET)
	public String cadastroTransportadora() {
		return "/cadastroTransportadora";
	}

	@RequestMapping(value = "/cadastrarTransportadora", method = RequestMethod.POST)
	private String cadastroTransportadora(@RequestParam("razaoSocial") String razao,
			@RequestParam("fantasia") String fantasia, @RequestParam("cnpj") String cnpj,
			@RequestParam("email") String email, @RequestParam("telefone") String telefone,
			@RequestParam("logradouro") String logradouro, @RequestParam("numero") String numero,
			@RequestParam("cidade") String cidade, @RequestParam("uf") String uf, @RequestParam("senha") String senha,
			@RequestParam("repetirSenha") String repetirSenha, @RequestParam("usuario") String user) {

		Transportadora transp = new Transportadora(null, razao, fantasia, cnpj, email, telefone, logradouro, numero,
				cidade, uf, user, senha, repetirSenha);

		tr.save(transp);

		return "redirect:/cadastrarValorFrete";
	}
	
	@RequestMapping(value="/listaTransportadora")
	public ModelAndView ListaTransportadora() {

		ModelAndView mv = new ModelAndView("cadastroValorFrete");

		Iterable<Transportadora> listaTransportadora = tr.findAll();
		mv.addObject("transportadora", listaTransportadora);

		return mv;
	}
 

}
