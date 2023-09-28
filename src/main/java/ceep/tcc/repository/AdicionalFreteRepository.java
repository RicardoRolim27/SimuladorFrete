package ceep.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ceep.tcc.models.AdicionalFrete;

public interface AdicionalFreteRepository extends CrudRepository<AdicionalFrete, Long>{
	
	@Transactional(readOnly = true)
	@Query("SELECT obj FROM AdicionalFrete obj WHERE obj.id = :transportadora")
	public List<AdicionalFrete> findByID(@Param("transportadora") Long transportadora);

}

