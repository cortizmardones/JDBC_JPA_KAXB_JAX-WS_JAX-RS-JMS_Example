package rest;

public class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private String fecha;
	private int idComuna;
	
	public Persona() {
		
	}

	public Persona(int id, String nombre, String apellido, String email, String fecha, int idComuna) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fecha = fecha;
		this.idComuna = idComuna;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdComuna() {
		return idComuna;
	}

	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
	}
	

}
