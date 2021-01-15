package Conn;

import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;

public class MongoClass {

	public static void main(String[] args) {
		
		try {
			MongoClient mongoClient = new MongoClient("localhost",27017);
			System.out.println("CONEXION EXITOSA");
		} catch ( Exception e ) {
			// TODO: handle exception
			
			e.printStackTrace();
			
		}

	}

}
