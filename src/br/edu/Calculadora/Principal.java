package br.edu.Calculadora;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Calculadora calculadoraDoPedrinho = new Calculadora();

		calculadoraDoPedrinho.somar(10,50);
		calculadoraDoPedrinho.somar(20,10);
		JOptionPane.showMessageDialog(null,"O valor somado é: "+ calculadoraDoPedrinho.getValor());

	}


}