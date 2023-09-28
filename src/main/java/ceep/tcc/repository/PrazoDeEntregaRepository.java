package ceep.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ceep.tcc.models.PrazoDeEntrega;

public interface PrazoDeEntregaRepository extends CrudRepository<PrazoDeEntrega, Long> {

	/*
	 * @Transactional(readOnly = true)
	 * 
	 * @Query("SELECT obj FROM PrazoDeEntrega obj WHERE obj.estado.id = :estado AND obj WHERE obj.cidade.id = :cidade AND obj.transportadora.id = :transportadora"
	 * ) public List<PrazoDeEntrega> findPrazo(@Param("estado") Long
	 * estado, @Param("cidade") Long cidade,
	 * 
	 * @Param("transportadora") Long transportadora);
	 */
	 
}
