package ceep.tcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ceep.tcc.models.AdicionalFrete;
import ceep.tcc.models.Transportadora;
import ceep.tcc.repository.AdicionalFreteRepository;

@Controller
public class AdicionalFreteController {

	@Autowired
	private AdicionalFreteRepository afr;

	@RequestMapping(value = "/cadastrarAdicionalFrete", method = RequestMethod.GET)
	public String cadastroValorFrete() {
		return "/cadastroValorFrete";
	}

	@RequestMapping(value = "/cadastrarAdicionalFrete", method = RequestMethod.POST)
	public String cadastroAdicionalFrete(@RequestParam("pedagio") double pedagio,
			@RequestParam("valorAdicional") double valorAdicional, @RequestParam("valorDoGris") double valorGris,
			@RequestParam("valorExcedente") double excedente, @RequestParam("transportadora")Transportadora transportadora) {

		AdicionalFrete adicional = new AdicionalFrete(null, pedagio, valorAdicional, valorGris, excedente,
			transportadora);

		afr.save(adicional);

		return "redirect:/cadastrarValorFrete";

	}

	@RequestMapping("/listaAdicionalFrete")
	public ModelAndView ListaFreteAdicionais() {

		ModelAndView mv = new ModelAndView("cadastroValorFrete");

		Iterable<AdicionalFrete> listaAdicionalFrete = afr.findAll();
		mv.addObject("adicionalFrete", listaAdicionalFrete);

		return mv;
	}

}
