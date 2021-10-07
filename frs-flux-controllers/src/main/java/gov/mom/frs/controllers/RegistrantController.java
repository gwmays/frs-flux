package gov.mom.frs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.mom.frs.model.domain.Registrant;
import gov.mom.frs.registration.services.RegistrantService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/frs")
public class RegistrantController {
	
	@Autowired
	RegistrantService registrantService ;
	
	@GetMapping( value = "/registrants", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<Registrant> getRegistrantsByUsername(@RequestHeader HttpHeaders headers) {
		String username = "gerald.w.mays@gmail.com" ; 
		//oktaUtil.getSubject(headers);
		Flux<Registrant> registrants = registrantService.findRegistrantByLoginId(username);
		return registrants ;
	}
	
}