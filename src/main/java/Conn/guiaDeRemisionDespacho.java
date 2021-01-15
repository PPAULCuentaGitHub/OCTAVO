package Conn;

public class guiaDeRemisionDespacho {
	
		int idGuiaDeRemisionDespacho;
	   String fechaGuiaDeRemisionDespacho, observacionGuiaDeRemisionDespacho;
	public guiaDeRemisionDespacho(int idGuiaDeRemisionDespacho, String fechaGuiaDeRemisionDespacho,
			String observacionGuiaDeRemisionDespacho) {
		super();
		this.idGuiaDeRemisionDespacho = idGuiaDeRemisionDespacho;
		this.fechaGuiaDeRemisionDespacho = fechaGuiaDeRemisionDespacho;
		this.observacionGuiaDeRemisionDespacho = observacionGuiaDeRemisionDespacho;
	}
	public int getIdGuiaDeRemisionDespacho() {
		return idGuiaDeRemisionDespacho;
	}
	public void setIdGuiaDeRemisionDespacho(int idGuiaDeRemisionDespacho) {
		this.idGuiaDeRemisionDespacho = idGuiaDeRemisionDespacho;
	}
	public String getFechaGuiaDeRemisionDespacho() {
		return fechaGuiaDeRemisionDespacho;
	}
	public void setFechaGuiaDeRemisionDespacho(String fechaGuiaDeRemisionDespacho) {
		this.fechaGuiaDeRemisionDespacho = fechaGuiaDeRemisionDespacho;
	}
	public String getObservacionGuiaDeRemisionDespacho() {
		return observacionGuiaDeRemisionDespacho;
	}
	public void setObservacionGuiaDeRemisionDespacho(String observacionGuiaDeRemisionDespacho) {
		this.observacionGuiaDeRemisionDespacho = observacionGuiaDeRemisionDespacho;
	}
	   
	   

}
