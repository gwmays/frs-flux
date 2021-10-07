package gov.mom.frs.registration.services.impl ;
 
import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.stereotype.Service ;

import gov.mom.frs.model.domain.Registrant ;
import gov.mom.frs.model.repositories.RegistrantRepository ;
import gov.mom.frs.registration.services.RegistrantService ;

import lombok.extern.log4j.Log4j2 ;

import reactor.core.publisher.Flux ;
import reactor.core.publisher.Mono ;

@Log4j2
@Service
public class RegistrantServiceImpl implements RegistrantService {

	@Autowired
	RegistrantRepository registrantRepository ;
	
	@Override
	public Flux<Registrant> findRegistrantByLoginId(String loginId) {
		
		return registrantRepository.findByLoginId( loginId ) ;
	
	}

	@Override
	public Mono<Registrant> createRegistrant(Registrant registrant) {
		
		return registrantRepository.save( registrant ) ;
		
	}
	
	@Override 
	public Mono<Registrant> updateRegistrant(Registrant registrant) {
		  
		return registrantRepository
		            .findById( registrant.getId() )
//		            .map(r -> new Registrant( registrant ) )
		            .map(r -> registrant )
		            .flatMap(registrantRepository::save) ;
		  
	}

	@Override
	public Mono<Registrant> findRegistrantById(Long id) {
	
		return registrantRepository.findById( id ) ;
		
	}
	
}