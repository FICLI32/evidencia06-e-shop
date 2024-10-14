import java.util.*;

public class Pedido {

	private Cuenta comprador;
	private Collection<FamiliaProducto> categoriaProductoAsociado;
	private Collection<MedioPago> medioPagoAsociado;
	private String fechaPedido;
	private String fechaLlegada;
	private EstadoPedido estadoPedido;
	private MedioPago medioPago;
	private double montoTotal;
	private String metodoEntrega;

	public String getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getFechaLlegada() {
		return this.fechaLlegada;
	}

	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public EstadoPedido getEstadoPedido() {
		return this.estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public MedioPago getMedioPago() {
		return this.medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	public double getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getMetodoEntrega() {
		return this.metodoEntrega;
	}

	public void setMetodoEntrega(String metodoEntrega) {
		this.metodoEntrega = metodoEntrega;
	}

	public Pedido(String fechaPedido, String fechaLlegada, EstadoPedido estadoPedido, MedioPago medioPago, double montoTotal, String metodoEntrega) {

	}

	public void modificarEstadoPedido() {

	}

	public void seleccionarMedioPago() {

	}

	public void cambiarMetodoEntrega() {

	}

	public void agregarPedido() {

	}

}