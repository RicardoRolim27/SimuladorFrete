/*
 * package ceep.tcc.service;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import ceep.tcc.DTO.PrazoDeEntregaDTO; import ceep.tcc.models.Cidade; import
 * ceep.tcc.models.Estado; import ceep.tcc.models.PrazoDeEntrega; import
 * ceep.tcc.models.Transportadora; import ceep.tcc.repository.CidadeRepository;
 * import ceep.tcc.repository.EstadoRepository; import
 * ceep.tcc.repository.PrazoDeEntregaRepository; import
 * ceep.tcc.repository.TransportadoraRepository;
 * 
 * 
 * public class PrazoDeEntregaService {
 * 
 * 
 * private PrazoDeEntregaRepository repository;
 * 
 * // @Autowired // private TransportadoraRepository transportadoraRepository;
 * // // @Autowired // private CidadeRepository cidadeRepository; //
 * // @Autowired // private EstadoRepository estadoRepository;
 * 
 * public List<PrazoDeEntrega> findAll() { return repository.findAll(); }
 * 
 * public PrazoDeEntrega findById(Long id) { Optional<PrazoDeEntrega> obj =
 * repository.findById(id); return obj.get(); }
 * 
 * // @Transactional // public PrazoDeEntrega insert(PrazoDeEntrega obj) { //
 * obj.setId(null); // obj = repository.save(obj); // return obj; // } // //
 * public PrazoDeEntrega fromDTO(PrazoDeEntregaDTO objDto) { // // Estado estado
 * = estadoRepository.getOne(objDto.getEstado(); // // Cidade cidade =
 * cidadeRepository.getOne(objDto.getCidade()); // Transportadora empresa =
 * transportadoraRepository.getOne(objDto.getEmpresa()); // PrazoDeEntrega pt =
 * new PrazoDeEntrega(null, objDto.getPrazoEmDias(), estado, cidade, empresa);
 * // return pt; // }
 * 
 * // public List<PrazoDeEntrega> findPrazo(Long estado, Long cidade, Long
 * transportadora) { // return repository.findPrazo(estado, cidade,
 * transportadora); // } }
 */