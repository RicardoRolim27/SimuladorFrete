package ceep.tcc.repository;

import org.springframework.data.repository.CrudRepository;

import ceep.tcc.models.Transportadora;

public interface TransportadoraRepository extends CrudRepository<Transportadora, Long> {

	Transportadora getOne(Object empresa);

}
