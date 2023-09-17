package controller;

import Model.PilhaInt;

public class controllerVetorPilha {

	PilhaInt p = new PilhaInt();

	public controllerVetorPilha() {
		super();
	}

	public void VetorPilha(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] >= 0) {

				p.push(vet[i]);

			} else {
				try {
					int v1 = p.pop();
					int v2 = p.pop();
					int soma = v1 + v2;
					p.push(vet[i]);
					p.push(soma);
				} catch (Exception e) {
					

				}

			}
		}
		System.err.print("Tamanho da pilha: " + p.size());
	}
}
