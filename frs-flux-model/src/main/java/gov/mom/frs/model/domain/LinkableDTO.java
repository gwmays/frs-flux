package gov.mom.frs.model.domain ;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty; ;

public abstract class LinkableDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6090303475592510724L;
	
	public LinkableDTO() {
		links = new ArrayList<Link> () ;
	}
	
	@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	private List<Link> links ;
	
	public void add(Link link) {
		links.add( link ) ;
	}
	
	@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	public List<Link> getLinks() {
		return links ;
	}
	
	@JsonIgnore
	public void setLinks(List<Link> links) {
		this.links = links ;
	}
	
}