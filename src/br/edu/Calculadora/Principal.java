package br.edu.Calculadora;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Calculadora calculadoraDoPedrinho = new Calculadora();

//		calculadoraDoPedrinho.somar(10,50);
//		calculadoraDoPedrinho.somar(20,10);
		int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));				
		calculadoraDoPedrinho.multiplicar(primeiroValor,segundoValor);
		
		JOptionPane.showMessageDialog(null, calculadoraDoPedrinho.getValor());

	}


}