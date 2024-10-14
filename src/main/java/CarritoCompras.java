import java.util.*;

public class CarritoCompras {

	private Cuenta gestor;
	private UsuarioWeb comprador;
	private Collection<FamiliaProducto> categoriaProductos;
	private int idCarrito;
	private double montoTotal;
	private List<Producto> productos;

	public int getIdCarrito() {
		return this.idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public double getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	public CarritoCompras(int idCarrito, int montoTotal, List<Producto> productos) {

	}

	public void eliminarProducto() {

	}

	public void aumentarProducto() {

	}

	public void realizarPedido() {

	}

}