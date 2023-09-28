package ceep.tcc.SimuladorFrete;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer{

	
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/efetuarLogin").setViewName("telaLogin");
	    registry.addViewController("/index").setViewName("index");
	    registry.addViewController("/cadastrarUsuario").setViewName("cadastroUsuario");
	    registry.addViewController("/cadastrarTransportadora").setViewName("cadastroTransportadora");
		
	  }
	
	
	
	
	
}
