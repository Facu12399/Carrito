package poo;

import java.util.*;

public class Carrito {

	public static void main(String[] args) {	
		String producto1, producto2, producto3;
		double precio1, precio2, precio3, total, descuento;
		int cantidad1, cantidad2, cantidad3;
		descuento=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del primer producto: ");
		producto1=entrada.nextLine();
		System.out.println("Ingrese el nombre del segundo producto: ");
		producto2=entrada.nextLine();
		System.out.println("Ingrese el nombre del tercer producto: ");
		producto3=entrada.nextLine();
		System.out.println("Ingrese el precio del primer producto: ");
		precio1=entrada.nextDouble();
		System.out.println("Ingrese el precio del segundo producto: ");
		precio2=entrada.nextDouble();
		System.out.println("Ingrese el precio del tercero producto: ");
		precio3=entrada.nextDouble();
		System.out.println("Ingrese la cantidad del primer producto: ");
		cantidad1=entrada.nextInt();
		System.out.println("Ingrese el cantidad del segundo producto: ");
		cantidad2=entrada.nextInt();
		System.out.println("Ingrese el cantidad del tercero producto: ");
		cantidad3=entrada.nextInt();
		System.out.println("------------------------------------------------------");
		total=(precio1*cantidad1)+(precio2*cantidad2)+(precio3*cantidad3);
		
		Producto catalogo = new Producto(producto1, producto2, producto3, 
				precio1, precio2, precio3, cantidad1, cantidad2, cantidad3);
		
		itemCarrito compra = new itemCarrito(catalogo.producto1, catalogo.producto2, catalogo.producto3, 
				catalogo.precio1, catalogo.precio2, catalogo.precio3, catalogo.cantidad1,
				catalogo.cantidad2, catalogo.cantidad3, total);
		
		System.out.println("Cantidad           Precio             Producto");
		System.out.println("   " + compra.cantidad1 + "               " + compra.precio1  + "            " + compra.producto1);
		System.out.println("   " + compra.cantidad2 + "               " + compra.precio2  + "            " +  compra.producto2);
		System.out.println("   " + compra.cantidad3 + "               " + compra.precio3  + "            " + compra.producto3);
		System.out.println("------------------------------------------------------");
		
		
		Descuento rebaja = new Descuento(compra.producto1, compra.producto2, compra.producto3, 
				compra.precio1, compra.precio2, compra.precio3, compra.cantidad1,
				compra.cantidad2, compra.cantidad3, compra.total, descuento);
		
		rebaja.descuento=compra.total*0.85;
		
		if(rebaja.total>1500) {
			System.out.println("El total de la compra es: $" + rebaja.total + ". Debido a que"
					+ " supera los $1500, tiene un descuento del 15%. Por lo tanto, debe pagar: $" 
					+ rebaja.descuento);
		}else {
			System.out.println("El total a pagar es: $" + rebaja.total);
		}
	
	}

}