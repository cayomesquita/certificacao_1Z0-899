package br.com.example.model;

import javax.servlet.http.*;
import java.lang.*;

public class Dog implements HttpSessionBindingListener {

	private String breed;

	public Dog(String breed) { 
		this.breed = breed;
	}

	public String getBreed() {
		return this.breed;
	}

	public void valueBound(HttpSessionBindingEvent ev){
		System.out.println(String.format("Bound attribute: %s=%s", ev.getName(), ev.getValue().toString()));
	}

	public void valueUnbound(HttpSessionBindingEvent ev){
		System.out.println(String.format("Unbound attribute: %s=%s", ev.getName(), ev.getValue().toString()));
	}

}
