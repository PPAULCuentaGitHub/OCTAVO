package e9.Conn;

public class documentoEmbarque {
	
	 int idDocumentoEmbarque;
    String fechaDocumentoEmbarque,observacionesDocumentoEmbarque;
	public documentoEmbarque(int idDocumentoEmbarque, String fechaDocumentoEmbarque,
			String observacionesDocumentoEmbarque) {
		super();
		this.idDocumentoEmbarque = idDocumentoEmbarque;
		this.fechaDocumentoEmbarque = fechaDocumentoEmbarque;
		this.observacionesDocumentoEmbarque = observacionesDocumentoEmbarque;
	}
	public int getIdDocumentoEmbarque() {
		return idDocumentoEmbarque;
	}
	public void setIdDocumentoEmbarque(int idDocumentoEmbarque) {
		this.idDocumentoEmbarque = idDocumentoEmbarque;
	}
	public String getFechaDocumentoEmbarque() {
		return fechaDocumentoEmbarque;
	}
	public void setFechaDocumentoEmbarque(String fechaDocumentoEmbarque) {
		this.fechaDocumentoEmbarque = fechaDocumentoEmbarque;
	}
	public String getObservacionesDocumentoEmbarque() {
		return observacionesDocumentoEmbarque;
	}
	public void setObservacionesDocumentoEmbarque(String observacionesDocumentoEmbarque) {
		this.observacionesDocumentoEmbarque = observacionesDocumentoEmbarque;
	}
    

}
