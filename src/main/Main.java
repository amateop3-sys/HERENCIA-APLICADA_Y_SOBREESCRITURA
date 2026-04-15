package main;

import java.util.Scanner;

import ejercicio1.*; // llama a todas las clases dentro del paquete
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;



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
		

		// EJERCICIO 3
		System.out.println("-----------------------------------------");
		ProductoPerecedero prod= new ProductoPerecedero("CAFÉ", "14/02/2027");
		prod.estaVencido();
		System.out.println("-----------------------------------------");
		
		
		// EJERCICIO 4
		System.out.println("-----------------------------------------");
		Transporte tr= new Transporte(55);
		Bus b= new Bus( 75,"INTERAMERICANA");
		tr.descripcion();
		b.descripcion();
		System.out.println("-----------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
