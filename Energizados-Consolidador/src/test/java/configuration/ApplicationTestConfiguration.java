package configuration;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import co.com.valtica.energizados.facturacion.domain.repositories.ConsumoAguaRepository;

@Profile("test")
@Configuration
public class ApplicationTestConfiguration {
	
	@Bean
    @Primary
    public ConsumoAguaRepository consumoAguaRepository() {
        return Mockito.mock(ConsumoAguaRepository.class);
    }

}
