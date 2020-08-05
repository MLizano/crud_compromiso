package com.crud.comp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ps_Rubro_Presupuestario")
public class Rubro {

	// campos de caracter informativo --------------------------
	@Id
	//@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "Rubro_id")
	private Integer Rubro_id;

	/*
	@Column(name = "Emp_id")
	private Integer Emp_id;
	*/

	@Column(name = "Estado_id")
	private Integer Estado_id;

	@Column(name = "Rubro_Nombre")
	private String Rubro_Nombre;

	@Column(name = "Rubro_Fec_Actualizacion")
	private String Rubro_Fec_Actualizacion;

	@Column(name = "Tipo_Ejecucion_id")
	private Integer Tipo_Ejecucion_id;

	@Column(name = "Ind_Solicitud")
	private Integer Ind_Solicitud;

	
	// campos modificables -----------------------------------
	@Column(name = "Id_Validador_Categoria")
	private Integer Id_Validador_Categoria;

	@Column(name = "En_Stock")
	private String En_Stock;

	@Column(name = "Estatus")
	private String Estatus;

	@Column(name = "Tipo_Rubro")
	private String Tipo_Rubro;

	@Column(name = "Id_Organizacion")
	private String Id_Organizacion;

	
	
	public Rubro() {
		// TODO Auto-generated constructor stub
	}

	
	public Rubro(Integer rubro_id, Integer estado_id, String rubro_Nombre,
			String rubro_Fec_Actualizacion, Integer tipo_Ejecucion_id, Integer ind_Solicitud,
			Integer id_Validador_Categoria, String en_Stock, String estatus, String tipo_Rubro,
			String id_Organizacion) {
		super();
		Rubro_id = rubro_id;
		Estado_id = estado_id;
		Rubro_Nombre = rubro_Nombre;
		Rubro_Fec_Actualizacion = rubro_Fec_Actualizacion;
		Tipo_Ejecucion_id = tipo_Ejecucion_id;
		Ind_Solicitud = ind_Solicitud;
		Id_Validador_Categoria = id_Validador_Categoria;
		En_Stock = en_Stock;
		Estatus = estatus;
		Tipo_Rubro = tipo_Rubro;
		Id_Organizacion = id_Organizacion;
	}

	
	public Integer getRubro_id() {
		return Rubro_id;
	}

	public void setRubro_id(Integer rubro_id) {
		Rubro_id = rubro_id;
	}

	/*
	public Integer getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		Emp_id = emp_id;
	}
	*/

	public Integer getEstado_id() {
		return Estado_id;
	}

	public void setEstado_id(Integer estado_id) {
		Estado_id = estado_id;
	}

	public String getRubro_Nombre() {
		return Rubro_Nombre;
	}

	public void setRubro_Nombre(String rubro_Nombre) {
		Rubro_Nombre = rubro_Nombre;
	}

	public String getRubro_Fec_Actualizacion() {
		return Rubro_Fec_Actualizacion;
	}

	public void setRubro_Fec_Actualizacion(String rubro_Fec_Actualizacion) {
		Rubro_Fec_Actualizacion = rubro_Fec_Actualizacion;
	}

	public Integer getTipo_Ejecucion_id() {
		return Tipo_Ejecucion_id;
	}

	public void setTipo_Ejecucion_id(Integer tipo_Ejecucion_id) {
		Tipo_Ejecucion_id = tipo_Ejecucion_id;
	}

	public Integer getInd_Solicitud() {
		return Ind_Solicitud;
	}

	public void setInd_Solicitud(Integer ind_Solicitud) {
		Ind_Solicitud = ind_Solicitud;
	}

	public Integer getId_Validador_Categoria() {
		return Id_Validador_Categoria;
	}

	public void setId_Validador_Categoria(Integer id_Validador_Categoria) {
		Id_Validador_Categoria = id_Validador_Categoria;
	}

	public String getEn_Stock() {
		return En_Stock;
	}

	public void setEn_Stock(String en_Stock) {
		En_Stock = en_Stock;
	}

	public String getEstatus() {
		return Estatus;
	}

	public void setEstatus(String estatus) {
		Estatus = estatus;
	}

	public String getTipo_Rubro() {
		return Tipo_Rubro;
	}

	public void setTipo_Rubro(String tipo_Rubro) {
		Tipo_Rubro = tipo_Rubro;
	}

	public String getId_Organizacion() {
		return Id_Organizacion;
	}

	public void setId_Organizacion(String id_Organizacion) {
		Id_Organizacion = id_Organizacion;
	}

	
	
	
}
