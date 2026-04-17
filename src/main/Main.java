package main;

import java.util.Scanner; // para entrada de texto

import ejercicio1.*; // llama a todas las clases dentro del paquete
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;
import ejercicio5.*;
import ejercicio6.*;
import ejercicio7.*;
import ejercicio8.*;
import ejercicio9.*;
import ejercicio10.*;

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
		
		
		
		// EJERCICIO 5
		System.out.println("-----------------------------------------");
		Empleado em= new Empleado("CARLOS", 55.22);
		Gerente ger= new Gerente("MARIO", 885.22, 500);
		System.out.println(em.getNombre());
		System.out.println(em.calcularSalario());
		System.out.println(ger.getNombre());
		System.out.println(ger.calcularSalario());
		System.out.println("-----------------------------------------");	
		
		
		
		// EJERCICIO 6
		System.out.println("-----------------------------------------");
		Perro dog= new Perro("PELUSA","CANICHE","CROQUETAS");
		System.out.println("NOMBRE: "+dog.getNombre());
		System.out.println("ESPECIE: "+dog.getEspecie());
		System.out.println("COMER: "+dog.getComer());
		dog.hacerSonido();
		System.out.println("-----------------------------------------");
		
		
		
		// EJERCICIO 7
		System.out.println("-----------------------------------------");
		Vehiculo v1= new Moto("HONDA", 400.5, 600);
		v1.mostrarInfo();
		System.out.println("-----------------------------------------");
		
		
		
		// EJERCICIO 8
		System.out.println("-----------------------------------------");
		Figura fi1= new Rectangulo(25.2, 45.22);
		System.out.println("AREA RECTANGULO: "+fi1.calcularArea());

		Figura cir1= new Circulo(45.22);
		System.out.println("AREA CIRCULO: "+cir1.calcularArea());
		System.out.println("-----------------------------------------");
		
		
		
		
		// EJERCICIO 9
		System.out.println("-----------------------------------------");
		Libro lib1= new Libro("100 años de soledad","Gabriel García Márquez");
		lib1.mostrarInfo();
		System.out.println("-----------------------------------------");
		LibroDigital ligit= new LibroDigital("Tu pez interior","Neil Shubin",5.09);
		ligit.mostrarInfo();
		System.out.println("-----------------------------------------");
		
		
		
		// EJERCICIO 10
		System.out.println("-----------------------------------------");
		Cliente c1= new Cliente("JUAN PABLO","01259685");
		FacturaContado fc1= new FacturaContado(001,c1, 8000, 333);
		System.out.println(c1);
		System.out.println(fc1);
		System.out.println("-----------------------------------------");
		FacturaCredito fct1= new FacturaCredito(002,c1, 9000, 400,200);
		System.out.println(c1);
		System.out.println(fct1);
		System.out.println("-----------------------------------------");
		
		

	}

}
