package Conn;

public class choferDespacho {
	
	int idChoferDespacho;
    String nombreChoferDespacho,placaChoferDespacho;
	public choferDespacho(int idChoferDespacho, String nombreChoferDespacho, String placaChoferDespacho) {
		super();
		this.idChoferDespacho = idChoferDespacho;
		this.nombreChoferDespacho = nombreChoferDespacho;
		this.placaChoferDespacho = placaChoferDespacho;
	}
	public int getIdChoferDespacho() {
		return idChoferDespacho;
	}
	public void setIdChoferDespacho(int idChoferDespacho) {
		this.idChoferDespacho = idChoferDespacho;
	}
	public String getNombreChoferDespacho() {
		return nombreChoferDespacho;
	}
	public void setNombreChoferDespacho(String nombreChoferDespacho) {
		this.nombreChoferDespacho = nombreChoferDespacho;
	}
	public String getPlacaChoferDespacho() {
		return placaChoferDespacho;
	}
	public void setPlacaChoferDespacho(String placaChoferDespacho) {
		this.placaChoferDespacho = placaChoferDespacho;
	}
    
    
    

}
