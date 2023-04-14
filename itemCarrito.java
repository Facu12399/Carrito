package poo;

public class itemCarrito extends Producto {
	double total;
	
	itemCarrito(String producto1, String producto2, String producto3, double precio1, 
			double precio2, double precio3,int cantidad1, int cantidad2, int cantidad3, double total){
		
		super(producto1,producto2, producto3, precio1, precio2, precio3, cantidad1, cantidad2, cantidad3);
		this.total=total;
	}
	
}
