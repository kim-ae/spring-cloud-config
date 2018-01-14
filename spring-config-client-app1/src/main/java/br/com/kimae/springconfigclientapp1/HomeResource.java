package br.com.kimae.springconfigclientapp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeResource {
	
	@Value("${message}")
	private String message;

	@RequestMapping(value="/",produces=MediaType.APPLICATION_JSON_VALUE)
	public String index() {
		return "Message: "+message;
	}
}
