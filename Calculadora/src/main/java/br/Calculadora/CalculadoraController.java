package br.Calculadora;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculadoraController {
	
	// Routes:
	// [1] GET /somar
	// [2] GET /subtrair
	// [3] GET /multiplicar
	// [4] GET /dividir
	
	// [5] GET /sen
	// [6] GET /cos
	// [7] GET /tg
	// [8] GET /pow
	// [9] GET /sqrt
	
	// [1]
	@GetMapping("/somar")
	public double somar(@RequestParam double num_1, @RequestParam double num_2) {
		return Calculadora.somar(num_1, num_2);
	}
	
	// [2]
	@GetMapping("/subtrair")
	public double subtrair(@RequestParam double num_1, @RequestParam double num_2) {
		return Calculadora.subtrair(num_1, num_2);
	}
	
	// [3]
	@GetMapping("/multiplicar")
	public double multiplicar(@RequestParam double num_1, @RequestParam double num_2) {
		return Calculadora.multiplicar(num_1, num_2);
	}
	
	// [4]
	@GetMapping("/dividir")
	public double dividir(@RequestParam double num_1, @RequestParam double num_2) {
		return Calculadora.dividir(num_1, num_2);
	}
	
	// ----- //
	
	// [5]
	@GetMapping("/sen")
	public double sen(@RequestParam double num_1) {
		return Calculadora.sen(num_1);
	}
	
	// [6]
	@GetMapping("/cos")
	public double cos(@RequestParam double num_1) {
		return Calculadora.cos(num_1);
	}
	
	// [7]
	@GetMapping("/tg")
	public double tg(@RequestParam double num_1) {
		return Calculadora.tg(num_1);
	}
	
	// [8]
	@GetMapping("/pow")
	public double pow(@RequestParam double num_1, @RequestParam double num_2) {
		return Calculadora.pow(num_1, num_2);
	}
	
	// [9]
	@GetMapping("/sqrt")
	public double sqrt(@RequestParam double num_1) {
		return Calculadora.sqrt(num_1);
	}
}
