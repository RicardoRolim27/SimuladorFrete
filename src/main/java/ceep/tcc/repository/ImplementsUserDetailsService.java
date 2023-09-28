package ceep.tcc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import ceep.tcc.models.Usuario;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository ur;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	     Usuario usuario = ur.findByUser(username);
		
		if (usuario == null) { throw new
			UsernameNotFoundException("Usuário não encontrado!");

		}
		
		return usuario;
	}
}
