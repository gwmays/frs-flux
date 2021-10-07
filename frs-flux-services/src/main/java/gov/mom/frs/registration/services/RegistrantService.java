package gov.mom.frs.registration.services;

import gov.mom.frs.model.domain.Registrant;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RegistrantService {

	public Flux<Registrant> findRegistrantByLoginId(String loginId) ;
	
	public Mono<Registrant> createRegistrant(Registrant registrant) ;

	public Mono<Registrant> updateRegistrant(Registrant registrant) ;
	
	public Mono<Registrant> findRegistrantById(Long id) ;

}