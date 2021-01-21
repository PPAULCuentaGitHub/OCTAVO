package e9.Conn;

public class tipoDeNotaDeCreditoVentas {

	int idTipoNotaDeCreditoVentas;
	String detalleNotaDeCreditoVentas;
	public tipoDeNotaDeCreditoVentas(int idTipoNotaDeCreditoVentas, String detalleNotaDeCreditoVentas) {
		super();
		this.idTipoNotaDeCreditoVentas = idTipoNotaDeCreditoVentas;
		this.detalleNotaDeCreditoVentas = detalleNotaDeCreditoVentas;
	}
	public int getIdTipoNotaDeCreditoVentas() {
		return idTipoNotaDeCreditoVentas;
	}
	public void setIdTipoNotaDeCreditoVentas(int idTipoNotaDeCreditoVentas) {
		this.idTipoNotaDeCreditoVentas = idTipoNotaDeCreditoVentas;
	}
	public String getDetalleNotaDeCreditoVentas() {
		return detalleNotaDeCreditoVentas;
	}
	public void setDetalleNotaDeCreditoVentas(String detalleNotaDeCreditoVentas) {
		this.detalleNotaDeCreditoVentas = detalleNotaDeCreditoVentas;
	}
	
}
