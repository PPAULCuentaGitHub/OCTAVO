package Conn;

public class notaDeCreditoVentas {

	String fechaNotaDeCreditoVentas, idDocumentoDeVentasVentas,responsableNotaDeCreditoVentas,observacionesNotaDeCreditoVentas,tipoNotaDeCreditoVentas;
	
	public notaDeCreditoVentas(String fechaNotaDeCreditoVentas, int idDocumentoDeVentasVentas,
			String responsableNotaDeCreditoVentas, String observacionesNotaDeCreditoVentas,
			int tipoNotaDeCreditoVentas) {		
	}

	public notaDeCreditoVentas(String fechaNotaDeCreditoVentas, String idDocumentoDeVentasVentas,
			String responsableNotaDeCreditoVentas, String observacionesNotaDeCreditoVentas,
			String tipoNotaDeCreditoVentas) {
		super();
		this.fechaNotaDeCreditoVentas = fechaNotaDeCreditoVentas;
		this.idDocumentoDeVentasVentas = idDocumentoDeVentasVentas;
		this.responsableNotaDeCreditoVentas = responsableNotaDeCreditoVentas;
		this.observacionesNotaDeCreditoVentas = observacionesNotaDeCreditoVentas;
		this.tipoNotaDeCreditoVentas = tipoNotaDeCreditoVentas;
	}

	public String getFechaNotaDeCreditoVentas() {
		return fechaNotaDeCreditoVentas;
	}

	public void setFechaNotaDeCreditoVentas(String fechaNotaDeCreditoVentas) {
		this.fechaNotaDeCreditoVentas = fechaNotaDeCreditoVentas;
	}

	public String getIdDocumentoDeVentasVentas() {
		return idDocumentoDeVentasVentas;
	}

	public void setIdDocumentoDeVentasVentas(String idDocumentoDeVentasVentas) {
		this.idDocumentoDeVentasVentas = idDocumentoDeVentasVentas;
	}

	public String getResponsableNotaDeCreditoVentas() {
		return responsableNotaDeCreditoVentas;
	}

	public void setResponsableNotaDeCreditoVentas(String responsableNotaDeCreditoVentas) {
		this.responsableNotaDeCreditoVentas = responsableNotaDeCreditoVentas;
	}

	public String getObservacionesNotaDeCreditoVentas() {
		return observacionesNotaDeCreditoVentas;
	}

	public void setObservacionesNotaDeCreditoVentas(String observacionesNotaDeCreditoVentas) {
		this.observacionesNotaDeCreditoVentas = observacionesNotaDeCreditoVentas;
	}

	public String getTipoNotaDeCreditoVentas() {
		return tipoNotaDeCreditoVentas;
	}

	public void setTipoNotaDeCreditoVentas(String tipoNotaDeCreditoVentas) {
		this.tipoNotaDeCreditoVentas = tipoNotaDeCreditoVentas;
	}


}
