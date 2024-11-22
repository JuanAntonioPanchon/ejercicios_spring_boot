package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorParImpar {
	@PostMapping("/parImpar")
	public String parImparEjercicio1(@RequestParam int numero) {
		String res;
		if(numero % 2 == 0) {
			res = "El numero " + numero + " es par";
		}else {
			res = "El numero " + numero + " es impar";
		}
		
		return "<h1>" +  res + "</h1>";
	}
}
