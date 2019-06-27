package com.prueba.prueba_dis;

import java.util.Date;

import com.vaadin.ui.TextField;

public class clase {

	private TextField Nombre;
	private TextField Mensaje;
	private Date Fecha;
	public TextField getNombre() {
		return Nombre;
	}
	public void setNombre(TextField nombre) {
		Nombre = nombre;
	}
	public TextField getMensaje() {
		return Mensaje;
	}
	public clase(TextField nombre, TextField mensaje, Date fecha) {
		super();
		Nombre = nombre;
		Mensaje = mensaje;
		Fecha = fecha;
	}
	public void setMensaje(TextField mensaje) {
		Mensaje = mensaje;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
}
