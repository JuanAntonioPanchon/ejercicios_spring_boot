package com.ejercicio.estructuras.Controlador;

import java.text.ParseException;
import java.util.Iterator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjercicios {
	// Ejercicio1 parImpar
	@PostMapping("/parImpar")
	public String parImparEjercicio1(@RequestParam int numero) {
		String res;
		if (numero % 2 == 0) {
			res = "El numero " + numero + " es par";
		} else {
			res = "El numero " + numero + " es impar";
		}
		return "<h1>" + res + "</h1>";
	}

	// Ejercicio2 tablaMultiplicar
	@PostMapping("/tablaMultiplicar")
	public String tablaMultiplicarEjercicio2(@RequestParam int numero) {
		String res = "";
		for (int i = 0; i <= 10; i++) {
			int multiplicacion = i * numero;
			res += "<p>" + i + " X " + numero + " = " + multiplicacion + "</p>";
		}
		return res;
	}

	// Ejercicio3 promedioCalificaciones
	@PostMapping("/promedioCalificaciones")
	public String promedioCalificaciones(@RequestParam String calificaciones) {
		String nuevaCalificaciones = calificaciones.replaceAll(" ", "");
		String[] notas = nuevaCalificaciones.split(",");
		double nota = 0;
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			nota += Double.parseDouble(notas[i]);
		}

		media = nota / notas.length;
		return media > 5 ? "Alumno tiene una media de " + media + " por tanto está aprobado "
				: " Alumno tiene media de " + media + " por tanto está suspenso";
	}

	// Ejercicio4 calculadoraIMC
	@PostMapping("/calcularIMC")
	public String calculadora_imc(@RequestParam double peso, @RequestParam double altura) {
		String res = "";
		double imc = peso / (altura * altura);
		if (imc < 18.5) {
			res = "IMC = " + imc + " Bajo peso";
		} else if (imc >= 18.5 && imc <= 24.9) {
			res = "IMC = " + imc + " Peso Normal";
		} else if (imc >= 25 && imc <= 29.9) {
			res = "IMC = " + imc + "Sobrepeso";
		} else {
			res = "IMC = " + imc + " Obesidad";
		}

		return res;
	}

	// Ejercicio5 encuesta satisfacción

	@PostMapping("/encuesta")
	public String encuesta(@RequestParam Integer satisfaccion) {
		String res = "";
		if (satisfaccion != null) {
			switch (satisfaccion) {
			case 1:
				res = "Muchas gracias, su puntuación ha sido de " + satisfaccion + " trataremos de mejorar para el futuro";
				break;
			case 2:
				res = "Muchas gracias, su puntuación ha sido de " + satisfaccion + " aun nos queda por mejorar";
				break;
			case 3:
				res = "Muchas gracias, su puntuación ha sido de " + satisfaccion
						+ " aunque no haya sido del todo negativo, mejoraremos para el futuro";
				break;
			case 4:
				res = "Muchas gracias, su puntuación ha sido de " + satisfaccion
						+ " siempre se puede mejorar y nosotros lo haremos para optener el máximo";
				break;
			case 5:
				res = "Muchas gracias, su puntuación ha sido de " + satisfaccion
						+ " nos alegra saber que cumplimos sus espectativas";
				break;
			default:
				res = "Debes realizar una puntuación de 1 a 5, siendo 1 lo peor y 5 lo mejor";
				break;
			}
		} else {
			res = "Debes realizar una puntuacion de manera obligatoria";
		}
		return res;
	}
}
