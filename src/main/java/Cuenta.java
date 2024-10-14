import java.util.*;

public class Cuenta {

	private Cliente dueño;
	private CarritoCompras carritoGestionado;
	private Collection<Pedido> pedidoARealizar;
	private Collection<MedioPago> mediosPagoGestionados;
	private int idCuenta;
	private String nombre;
	private List<MedioPago> medioPago;

	public int getIdCuenta() {
		return this.idCuenta;
	}


	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<MedioPago> getMedioPago() {
		return this.medioPago;
	}

	public void setMedioPago(List<MedioPago> medioPago) {
		this.medioPago = medioPago;
	}

	public Cuenta(int idCuenta, String nombre, List<MedioPago> medioPago) {

	}

	public void cambiarNombreCuenta() {

	}

}