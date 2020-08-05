package com.crud.comp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Compromiso_Personas_pruebas")
public class Persona {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Usuario_Id")
	private Integer  Usuario_Id;
	
	@Column(name="Usuario_Nombre")
	private String Usuario_Nombre;
	
	@Column(name="Usuario_Login")
	private String Usuario_Login;
	
	@Column(name="Usuario_Email")
	private String Usuario_Email;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Apellido_Paterno")
	private String Apellido_Paterno;
	
	@Column(name="Apellido_Materno")
	private String Apellido_Materno;
	
	@Column(name="Id_Puesto")
	private Integer  Id_Puesto;
	
	@Column(name="Id_Ceco")
	private Integer  Id_Ceco;
	
	@Column(name="Tipo_Usr")
	private String Tipo_Usr;
	
	@Column(name="Puesto_Clave", nullable= true)
	private String Puesto_Clave;
	
	@Column(name="Id_Organizacion")
	private Integer  Id_Organizacion;
	
	@Column(name="Id_Jefe", nullable= true)
	private Integer  Id_Jefe;
	
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}



	public Persona(Integer usuario_Id, String usuario_Nombre, String usuario_Login, String usuario_Email, String nombre,
			String apellido_Paterno, String apellido_Materno, Integer id_Puesto, Integer id_Ceco, String tipo_Usr,
			String puesto_Clave, Integer id_Organizacion, Integer id_Jefe) {
		super();
		Usuario_Id = usuario_Id;
		Usuario_Nombre = usuario_Nombre;
		Usuario_Login = usuario_Login;
		Usuario_Email = usuario_Email;
		Nombre = nombre;
		Apellido_Paterno = apellido_Paterno;
		Apellido_Materno = apellido_Materno;
		Id_Puesto = id_Puesto;
		Id_Ceco = id_Ceco;
		Tipo_Usr = tipo_Usr;
		Puesto_Clave = puesto_Clave;
		Id_Organizacion = id_Organizacion;
		Id_Jefe = id_Jefe;
	}



	public Integer getUsuario_Id() {
		return Usuario_Id;
	}

	public void setUsuario_Id(Integer usuario_Id) {
		Usuario_Id = usuario_Id;
	}

	public String getUsuario_Nombre() {
		return Usuario_Nombre;
	}

	public void setUsuario_Nombre(String usuario_Nombre) {
		Usuario_Nombre = usuario_Nombre;
	}

	public String getUsuario_Login() {
		return Usuario_Login;
	}

	public void setUsuario_Login(String usuario_Login) {
		Usuario_Login = usuario_Login;
	}

	public String getUsuario_Email() {
		return Usuario_Email;
	}

	public void setUsuario_Email(String usuario_Email) {
		Usuario_Email = usuario_Email;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido_Paterno() {
		return Apellido_Paterno;
	}

	public void setApellido_Paterno(String apellido_Paterno) {
		Apellido_Paterno = apellido_Paterno;
	}

	public String getApellido_Materno() {
		return Apellido_Materno;
	}

	public void setApellido_Materno(String apellido_Materno) {
		Apellido_Materno = apellido_Materno;
	}

	public Integer getId_Puesto() {
		return Id_Puesto;
	}

	public void setId_Puesto(Integer id_Puesto) {
		Id_Puesto = id_Puesto;
	}

	public Integer getId_Ceco() {
		return Id_Ceco;
	}

	public void setId_Ceco(Integer id_Ceco) {
		Id_Ceco = id_Ceco;
	}

	public String getTipo_Usr() {
		return Tipo_Usr;
	}

	public void setTipo_Usr(String tipo_Usr) {
		Tipo_Usr = tipo_Usr;
	}

	public String getPuesto_Clave() {
		return Puesto_Clave;
	}

	public void setPuesto_Clave(String puesto_Clave) {
		Puesto_Clave = puesto_Clave;
	}

	public Integer getId_Organizacion() {
		return Id_Organizacion;
	}

	public void setId_Organizacion(Integer id_Organizacion) {
		Id_Organizacion = id_Organizacion;
	}

	public Integer getId_Jefe() {
		return Id_Jefe;
	}

	public void setId_Jefe(Integer id_Jefe) {
		Id_Jefe = id_Jefe;
	}


}
