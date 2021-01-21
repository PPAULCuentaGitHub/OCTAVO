package e9.Conn;

import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;




public class MongoClass {

	public static void main(String[] args) {
		
		
		try {
			
			MongoClient mongo= new MongoClient();
			DB db= mongo.getDB("OCTAVO");
			
			
			DBCollection coleccion= db.getCollection("notaDeCreditoVentas");
			BasicDBObject objeto= new BasicDBObject();
			
			notaDeCreditoVentas ncv = new notaDeCreditoVentas ("12/02/2020",1,"das","dasdasd",2);
			
			objeto.put("fechaNotaDeCreditoVentas",ncv.getFechaNotaDeCreditoVentas());
			objeto.put("idDocumentoDeVentasVentas",ncv.getIdDocumentoDeVentasVentas());
			objeto.put("responsableNotaDeCreditoVentas",ncv.getResponsableNotaDeCreditoVentas());
			objeto.put("observacionesNotaDeCreditoVentas",ncv.getObservacionesNotaDeCreditoVentas());
			objeto.put("tipoNotaDeCreditoVentas",ncv.getTipoNotaDeCreditoVentas());			
			coleccion.insert(objeto);

			/*
			
			
			DBCollection coleccion= db.getCollection("Persona");
			BasicDBObject objeto= new BasicDBObject();
			Persona p= new Persona("pepe","perez");
			objeto.put("nombre",p.getNombre() );
			objeto.put("apellidos",p.getApellidos());
			coleccion.insert(objeto);
			*/
			
			
			
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}

}
