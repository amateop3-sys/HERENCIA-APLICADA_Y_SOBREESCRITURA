package main;

import java.util.Scanner;

import ejercicio1.*; // llama a todas las clases dentro del paquete
import ejercicio2.*;

public class Main {

	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// EJERCICIO 1
		System.out.println("-----------------------------------------");
		Persona p=new Persona("JOSHUA", 50);
		Persona p1=new Docente("PEDRO",50,"FISICO");
		Persona p2=new Estudiante("MARIA",15,"45BT554");
		p.mostrar();
		p1.mostrar();
		p2.mostrar();
	
		
		//-------------------------------------------------
		
		// EJERCICIO 2
		System.out.println("-----------------------------------------");
		Cuenta c= new CuentaCorriente(555,200);
		c.retirar(8000);
		System.out.println("-----------------------------------------");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
