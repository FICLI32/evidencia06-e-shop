public class UsuarioWeb {

	private Cliente cliente;
	private CarritoCompras almacenamientoCompras;
	private int idUsuario;
	private String nombreUsuario;
	private EstadoUsuario estadoUsuario;

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public EstadoUsuario getEstadoUsuario() {
		return this.estadoUsuario;
	}

	public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public UsuarioWeb(int idUsuario, String nombreUsuario, EstadoUsuario estadoUsuario) {

	}

	public void cambiarNombreUsuario() {

	}

	public void ajustarEstadoUsuario() {

	}

	public void agregarProductoCarrito() {

	}

	public void modificarEstadoUsario(int EstadoUsuario) {

	}

}