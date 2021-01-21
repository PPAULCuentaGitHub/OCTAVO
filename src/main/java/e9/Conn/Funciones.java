package e9.Conn;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Funciones {
	
	public void creaNotaCredito(){
		
			try {
			
				String a = "12/01/2020", c="Andres", d="Observacion";
				int b=1, e = 2;
			MongoClient mongo= new MongoClient();
			
			DB db= mongo.getDB("OCTAVO");
			
			
			DBCollection coleccion= db.getCollection("notaDeCreditoVentas");
			BasicDBObject objeto= new BasicDBObject();
			
			notaDeCreditoVentas ncv = new notaDeCreditoVentas (a,b,c,d,e);
			
			objeto.put("fechaNotaDeCreditoVentas",ncv.getFechaNotaDeCreditoVentas());
			objeto.put("idDocumentoDeVentasVentas",ncv.getIdDocumentoDeVentasVentas());
			objeto.put("responsableNotaDeCreditoVentas",ncv.getResponsableNotaDeCreditoVentas());
			objeto.put("observacionesNotaDeCreditoVentas",ncv.getObservacionesNotaDeCreditoVentas());
			objeto.put("tipoNotaDeCreditoVentas",ncv.getTipoNotaDeCreditoVentas());			
			coleccion.insert(objeto);

			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		
	}
	
	
	public void creaIdTipoCredito() {
		
			try {
				int b = 1;
				String a="Devolucion" ;
			
			MongoClient mongo= new MongoClient();
			
			DB db= mongo.getDB("OCTAVO");
			
			
			DBCollection coleccion= db.getCollection("tipoDeNotaDeCreditoVentas");
			BasicDBObject objeto= new BasicDBObject();
			
			tipoDeNotaDeCreditoVentas tnc = new tipoDeNotaDeCreditoVentas (b,a);
			
			objeto.put("idTipoNotaDeCreditoVentas",tnc.getIdTipoNotaDeCreditoVentas());
			objeto.put("detalleNotaDeCreditoVentas",tnc.getDetalleNotaDeCreditoVentas());		
			coleccion.insert(objeto);

			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	
	
	
	public void creaGuiaRemisionDespacho() {
		
		try {
			
			int a = 1;
			String b = "10/01/2020", c= "Hola hola";
		    	
		    MongoClient mongo= new MongoClient();
		
			DB db= mongo.getDB("OCTAVO");
		
			DBCollection coleccion= db.getCollection("guiaDeRemisionDespacho");
			BasicDBObject objeto= new BasicDBObject();
			
			guiaDeRemisionDespacho grd = new guiaDeRemisionDespacho (a,b,c);
			
			objeto.put("idGuiaDeRemisionDespacho",grd.getIdGuiaDeRemisionDespacho());
			objeto.put("fechaGuiaDeRemisionDespacho",grd.getFechaGuiaDeRemisionDespacho());
			objeto.put("observacionGuiaDeRemisionDespacho",grd.getObservacionGuiaDeRemisionDespacho());
			
			coleccion.insert(objeto);
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
	}
	
	public void creaChoferDespacho() {
		
		
		
		try {
			int a =1;
			String b = "Paul Proaño",c = "PCC - 3289";
			
			MongoClient mongo= new MongoClient();
			
			DB db= mongo.getDB("OCTAVO");
		
			DBCollection coleccion= db.getCollection("choferDespacho");
			BasicDBObject objeto= new BasicDBObject();
			
			
			choferDespacho cd = new choferDespacho (a,b,c);
			
			objeto.put("idChoferDespacho",cd.getIdChoferDespacho());
			objeto.put("nombreChoferDespacho",cd.getNombreChoferDespacho());
			objeto.put("placaChoferDespacho",cd.getPlacaChoferDespacho());
			
			
			coleccion.insert(objeto);
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}
	
public void creaDocumentoEmbarque() {
		
		
		
		try {
			
			int a =1;
			String b = "20/01/2020",c = "Hola Hola";
			
			MongoClient mongo= new MongoClient();
			
			DB db= mongo.getDB("OCTAVO");
		
			DBCollection coleccion= db.getCollection("documentoEmbarque");
			BasicDBObject objeto= new BasicDBObject();
			
			
			documentoEmbarque de = new documentoEmbarque (a,b,c);
			
			objeto.put("idDocumentoEmbarque",de.getIdDocumentoEmbarque());
			objeto.put("fechaDocumentoEmbarque",de.getFechaDocumentoEmbarque());
			objeto.put("observacionesDocumentoEmbarque",de.getObservacionesDocumentoEmbarque());
			
			
			coleccion.insert(objeto);
			
		}catch(UnknownHostException e) {
			e.printStackTrace();	
		}
}
	
}
