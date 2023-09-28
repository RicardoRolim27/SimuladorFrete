package ceep.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ceep.tcc.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	
	@Transactional(readOnly = true)
	@Query("SELECT obj FROM Usuario obj WHERE obj.user = :usuario")
	public List<Usuario> findByUsuario(@Param("usuario") String usuario);
	
	Usuario findByUser(String user);
	
}
