import java.util.*;

public class Producto {

	private Collection<FamiliaProducto> categoriaProducto;
	private String nombreProducto;
	private double precio;
	private int stock;

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return this.precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Producto(String nombreProducto, double precio, int stock) {

	}

	public void modificarStock() {

	}

	public void modificarPrecio() {

	}

}