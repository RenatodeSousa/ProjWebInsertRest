package br.com.teste;

import br.com.controle.CarroCtrl;
import br.com.entidade.Carro;

public class Teste {

	public static void main (String[] args) {
		
		Carro c = new Carro();
		c.setModelo("ford");
		c.setNome("ka");
		
		CarroCtrl controle = new CarroCtrl();
		controle.insert(c);
		
		for (Carro carro : new CarroCtrl().select(Carro.CONS_CARRO_ALL)) {
			System.out.println("id:"+ carro.getId());
			System.out.println("nome:"+ carro.getNome());
			System.out.println("modelo:"+ carro.getModelo());
		}
	}
}
