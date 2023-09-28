package ceep.tcc.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ceep.tcc.models.AdicionalFrete;
import ceep.tcc.models.SimuladorFrete;
import ceep.tcc.models.Transportadora;
import ceep.tcc.models.ValorFrete;
import ceep.tcc.repository.AdicionalFreteRepository;
import ceep.tcc.repository.TransportadoraRepository;
import ceep.tcc.repository.ValorFreteRepository;

@Controller
public class SimuladorFreteController {

	@Autowired
	private ValorFreteRepository vfr;
	@Autowired
	private AdicionalFreteRepository afr;
	@Autowired
	private TransportadoraRepository tr;

	@RequestMapping(value = "/simuladorFrete", method = RequestMethod.GET)
	private String simularFrete() {

		return "/simuladorFrete";
	}

	@RequestMapping(value = "/simuladorFrete", method = RequestMethod.POST)
	public String simuladorFrete(HttpSession session, @RequestParam("pesoMercadoria") double peso,
			@RequestParam("valorNFE") double valorNF, @RequestParam("estadoOrigem") String estadoOrigem,
			@RequestParam("cidadeOrigem") String cidadeOrigem, @RequestParam("estadoDestino") String estadoDestino,
			@RequestParam("cidadeDestino") String cidadeDestino, @RequestParam("transportadora") Long transportadora) {

		double vlf = 0;
		double pesoMercadoria = peso;
		double valorFrete = 0;
		double pedagio = 0;
		double valorAdicional = 0;
		double valorDoGris = 0;
		double valorExcedente = 0;
		//double valorComPesoExcedente = 0;

		SimuladorFrete simulador = new SimuladorFrete();

		simulador.setValorNFE(valorNF);
		simulador.setPesoMercadoria(peso);
		simulador.setEstadoOrigem(estadoOrigem);
		simulador.setCidadeOrigem(cidadeOrigem);
		simulador.setEstadoDestino(estadoDestino);
		simulador.setCidadeDestino(cidadeDestino);

		List<ValorFrete> frete = vfr.findByPeso(peso, transportadora);

		List<AdicionalFrete> adicional = afr.findByID(transportadora);
		

		vlf = frete.get(0).getValorFrete();

		pedagio = adicional.get(0).getPedagio();

		valorDoGris = adicional.get(0).getValorDoGris();
		
		valorExcedente = adicional.get(0).getValorExcedente();
		

		if (valorNF > 1500) {

			valorAdicional = adicional.get(0).getValorAdicional();
			valorAdicional = (valorAdicional * valorNF) / 100;
		}

		
//		  if (pesoMercadoria > 300) {
//		  
//			  valorComPesoExcedente = (pesoMercadoria - 300) * valorExcedente;
//		  
//		  }
		 

		valorDoGris = (valorDoGris * valorNF) / 100;

		valorFrete = vlf + pedagio + valorAdicional + valorDoGris;

		simulador.setValorDoFrete(valorFrete);

		System.out.println(vlf);
		System.out.println(pesoMercadoria);
		System.out.println(pedagio);
		System.out.println(valorAdicional);
		System.out.println(valorDoGris);
		System.out.println(valorExcedente);
		System.out.println(valorFrete);

		session.setAttribute("SessionSimulador", valorFrete);

		return "redirect:/simuladorFrete";
	}

	public List<ValorFrete> consulta(@RequestParam("pesoMercadoria") double peso,
			@Param("transportadora") Long transportadora) {

		return vfr.findByPeso(peso, transportadora);
	}

	@RequestMapping(value = "/transportadoras")
	public ModelAndView ListaTransportadora() {

		ModelAndView mv = new ModelAndView("simuladorFrete");

		Iterable<Transportadora> listaTransportadora = tr.findAll();
		mv.addObject("transportadora", listaTransportadora);

		return mv;
	}

}
