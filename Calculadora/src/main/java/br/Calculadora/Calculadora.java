package br.Calculadora;


public class Calculadora {
	
	// Básico //
	public static double somar(double a, double b) {
		return a+b;
	}
	
	public static double subtrair(double a, double b) {
		return a-b;
	}

	public static double multiplicar(double a, double b) {
		return a*b;
	}
	
	public static double dividir(double a, double b) {
		return a/b;
	}
	
	// 5 funções extras  //
	
	public static double sen(double a) {
		return Math.sin(a);
	}
	
	public static double cos(double a) {
		return Math.cos(a);
	}
	
	public static double tg(double a) {
		return Math.tan(a);
	}
	
	public static double pow(double a, double b) {
		return Math.pow(a, b);
	}
	
	public static double sqrt(double a) {
		return Math.sqrt(a);
	}
}

