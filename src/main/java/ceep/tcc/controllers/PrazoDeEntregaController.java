
package ceep.tcc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ceep.tcc.models.PrazoDeEntrega;
import ceep.tcc.repository.PrazoDeEntregaRepository;

@Controller
public class PrazoDeEntregaController {

 @Autowired	
 private PrazoDeEntregaRepository prazoRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<PrazoDeEntrega> findById(@PathVariable Long id) {

		return null;
	}
	
	/*
	 * public List<PrazoDeEntrega> findPrazo(Long estado, Long cidade, Long
	 * transportadora) { return prazoRepository.findPrazo(estado, cidade,
	 * transportadora); }
	 */
	
	
	

//	@RequestMapping(value = "/{estado}/{cidade}/{transportadora}/prazo", method = RequestMethod.GET)
//	public ResponseEntity<List<PrazoEmDiaDTO>> findPrazo(@PathVariable Long estado,
//
//			@PathVariable Long cidade, @PathVariable Long transportadora) {
//
//		List<PrazoDeEntrega> list = service.findPrazo(estado, cidade, transportadora);
//		List<PrazoEmDiaDTO> listDto = list.stream().map(obj -> new
//
//		PrazoEmDiaDTO(obj)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(listDto);
//	}
	

	/*
	 * @RequestMapping(method = RequestMethod.GET) public
	 * ResponseEntity<List<PrazoEmDiaDTO>> findAll() { List<PrazoDeEntrega> list =
	 * service.findAll(); PrazoEmDiaDTO obj; List<PrazoEmDiaDTO> listDto =
	 * list.stream().map(obj -> new
	 * 
	 * PrazoEmDiaDTO(obj)).collect(Collectors.toList()); return
	 * ResponseEntity.ok().body(listDto); }
	 * 
	 * // @RequestMapping(method = RequestMethod.POST) // public
	 * ResponseEntity<Void> insert(@Valid @RequestBody PrazoDeEntregaDTO // objDto)
	 * { // // PrazoDeEntrega obj = service.fromDTO(objDto); // obj =
	 * service.insert(obj); // URI uri = // //
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
	 * (obj.getId()) // .toUri(); // // return ResponseEntity.created(uri).build();
	 * // // }
	 */  
  
}
