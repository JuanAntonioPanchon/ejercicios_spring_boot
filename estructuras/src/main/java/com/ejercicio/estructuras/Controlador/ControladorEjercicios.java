package com.ejercicio.estructuras.Controlador;

import java.text.ParseException;
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
	
	@PostMapping("/promedioCalificaciones")
	public String promedioCalificaciones (@RequestParam String calificaciones) {
		String nuevaCalificaciones = calificaciones.replaceAll(" ", "");
		String[] notas = nuevaCalificaciones.split(",");
		double nota = 0;
		double media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			nota += Double.parseDouble(notas[i]);
		}
		
		media = nota / notas.length;
		return media > 5 ? "Alumno tiene una media de " + media + " por tanto está aprobado " : " Alumno tiene media de " + media + " por tanto está suspenso";
		
		
	}
}
