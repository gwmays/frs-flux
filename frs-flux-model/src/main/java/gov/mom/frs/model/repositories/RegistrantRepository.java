package gov.mom.frs.model.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import gov.mom.frs.model.domain.Registrant;
import reactor.core.publisher.Flux; ;

public interface RegistrantRepository extends ReactiveCrudRepository<Registrant, Long> {
	
	public Flux<Registrant> findByLoginId(String loginId) ;

}