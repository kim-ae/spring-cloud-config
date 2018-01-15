package br.com.kimae.springconfigclientapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kimae.springconfigclientapp1.persistence.ObjRepository;

@RestController
@RefreshScope
public class HomeResource {
	
	@Value("${message}")
	private String message;
	
	@Autowired
	private ObjRepository rep;
	
	@RequestMapping(value="/banco",produces=MediaType.TEXT_PLAIN_VALUE)
	public String banco() {
		return rep.findOne(1).getTxt();
	}

	@RequestMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public String index() {
		return "Message: "+message;
	}
}
