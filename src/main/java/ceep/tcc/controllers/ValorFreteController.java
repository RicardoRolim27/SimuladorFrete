package ceep.tcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ceep.tcc.models.Transportadora;
import ceep.tcc.models.ValorFrete;
import ceep.tcc.repository.ValorFreteRepository;

@Controller
public class ValorFreteController {

	@Autowired
	private ValorFreteRepository vfr;

	@RequestMapping(value = "/cadastrarValorFrete", method = RequestMethod.GET)
	public String cadastroValorFrete() {
		return "/cadastroValorFrete";
	}

	@RequestMapping(value = "/cadastrarValorFrete", method = RequestMethod.POST)
	public String cadastroValorFrete(@RequestParam("pesoInicial") double pesoInicial,
			@RequestParam("pesoFinal") double pesoFinal, @RequestParam("valorFrete") double valorFrete,
			@RequestParam("transportadora") Transportadora transportadora) {

		ValorFrete frete = new ValorFrete(null, pesoInicial, pesoFinal, valorFrete, transportadora);

		vfr.save(frete);

		return "redirect:/cadastrarValorFrete";

	}

	@RequestMapping("/fretes")
	public ModelAndView ListaFretes() {

		ModelAndView mv = new ModelAndView("cadastroValorFrete");

		Iterable<ValorFrete> frete = vfr.findAll();
		mv.addObject("valorFrete", frete);
		return mv;
	}

	/*
	 * @RequestMapping(value="/cadastrarValorFrete", method=RequestMethod.POST)
	 * public String cadastroValorFrete(@ModelAttribute ValorFrete valorFrete){
	 * 
	 * vfr.save(valorFrete);
	 * 
	 * return "redirect:/cadastroValorFrete";
	 * 
	 * }
	 */

}
