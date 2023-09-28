package ceep.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ceep.tcc.models.ValorFrete;

public interface ValorFreteRepository extends CrudRepository<ValorFrete, Long> {
	
	@Transactional(readOnly = true)
	@Query("SELECT obj FROM ValorFrete obj WHERE obj.pesoInicial <= :pesoMercadoria AND obj.pesoFinal >= :pesoMercadoria AND obj.transportadora.id = :transportadora")
	public List<ValorFrete> findByPeso(@Param("pesoMercadoria") double pesoMercadoria,
			@Param("transportadora") Long transportadora);

}

