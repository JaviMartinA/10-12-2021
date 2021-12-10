  package com.segundo;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList notas = new ArrayList<Double>();
		int flag = 1;
		double tot = 0;
		Scanner lectura = new Scanner (System.in);
		
		for(int i= 0;i<4;++i) {
			System.out.print("Introduzca la nota: ");
			double nota = lectura.nextDouble();
			notas.add(nota);
		}
		
		for(int i=0;i<notas.size();i++) {
			double nota1 = (double) notas.get(i);
			if (nota1 <4){
				System.out.println("Asigantura suspensa");
				flag = 0;
			}
		}
		
		if (flag == 1) {
			tot = ((double) notas.get(0)*0.4) + ((double) notas.get(1)*0.6) + ((double) notas.get(2)*0.3) + ((double) notas.get(3)*0.7);
			tot = tot / 2;
			System.out.println("La calificacion de la media es: " + tot);
		}
		
		
		
		
	}

}
