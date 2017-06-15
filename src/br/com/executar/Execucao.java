package br.com.executar;

import br.com.empresa.FazAlgo;

public class Execucao {

	public static void main(String[] args) {
		FazAlgo faz  = new FazAlgo();
		faz.setValor(10);
		System.out.println(faz.getValor());
	}

}
