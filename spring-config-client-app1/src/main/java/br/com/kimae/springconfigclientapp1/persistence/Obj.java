package br.com.kimae.springconfigclientapp1.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="obj")
public class Obj {

	@Id
	private Integer id;
	
	private String txt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
}
