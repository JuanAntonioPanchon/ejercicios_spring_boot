package com.ejercicio.estructuras.Controlador;

import java.util.Iterator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	//Ejercicio1 parImpar
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
	
	//Ejercicio2 tablaMultiplicar
	@PostMapping("/tablaMultiplicar")
	public String tablaMultiplicarEjercicio2(@RequestParam int numero) {
		String res = "";
		for (int i = 0; i <= 10; i++) {
			int multiplicacion = i * numero;
			res += "<p>" + i + " X " + numero + " = " + multiplicacion + "</p>";
		}
		return res;
	}
}
