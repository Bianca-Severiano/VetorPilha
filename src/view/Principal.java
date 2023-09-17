package view;

import controller.controllerVetorPilha;

public class Principal {

	public static void main(String[] args) {
		 int vet[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		 
		 controllerVetorPilha cp = new controllerVetorPilha();
		 
		 cp.VetorPilha(vet);

	}

}
