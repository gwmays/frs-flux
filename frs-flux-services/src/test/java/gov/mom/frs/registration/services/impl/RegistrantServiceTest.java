package gov.mom.frs.registration.services.impl;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;

import gov.mom.frs.model.domain.Registrant;
import gov.mom.frs.registration.services.RegistrantService;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@Log4j2
@DataR2dbcTest
public class RegistrantServiceTest {
	
	@Autowired
	RegistrantServiceImpl service ;
	
	@Test
    public void createTest() {
		
		Registrant registrant = new Registrant() ;
		
		Date date = new Date();
		OffsetDateTime offsetDateTime = date.toInstant()
		  .atOffset(ZoneOffset.UTC);
		
    	registrant.setDateCreated(offsetDateTime);
    	registrant.setLastUpdated(offsetDateTime);
    	registrant.setLoginId( "gerald.w.mays@gmail.com" ) ;
    	registrant.setName( "Homer J Simpson" ) ;
    	registrant.setOperatingName( "The Three Broomsticks" ) ;
    	registrant.setOwlPostAddress( "The Three Broomsticks, High Street, Hogsmeade" ) ;
    	registrant.setProviderName( "Madam Rosmerta" ) ;
    	registrant.setTitle( "Buffoon" ) ;
    	
        Mono<Registrant> registrantMono = 
        	this.service.createRegistrant( registrant ) ;
        
        StepVerifier
            .create(registrantMono)
            .expectNextMatches(saved -> StringUtils.hasText(saved.getId().toString()))
            .verifyComplete();
    }
	
}