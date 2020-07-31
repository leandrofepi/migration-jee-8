package br.fepi.si;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
/**
 * 
 * @author leandro
 * https://rieckpil.de/whatis-java-server-faces-an-introduction-to-jsf-2-3/
 */
public class HelloWorldBacking {

	private String name;
	private String greet;

	public void greetPerson() {
		this.greet = "Hello World: " + this.name + " !";
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}