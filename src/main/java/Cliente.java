public class Cliente {

	private Cuenta cuentaAsociada;
	private UsuarioWeb servicioAsociado;
	private String nombre;
	private String numeroTelefono;
	private String correo;
	private String rut;
	private String residencia;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getResidencia() {
		return this.residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}


	public Cliente(String nombre, int numeroTelefono, String correo, int rut, String residencia) {

	}

	public void cambiarCorreo() {

	}

	public void crearCuenta() {

	}

	public void comprarProducto() {

	}

}