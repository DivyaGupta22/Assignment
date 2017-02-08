package com.divya.general;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class MongoDBConn {
	
	
	public  static void insertDoc(MongoDatabase db){
	MongoCollection<Document> coll = db.getCollection("names");		
			Document docm = new Document();
		docm.put("job_id", 430);
	docm.put("name", "op");
     coll.insertOne(docm);
     System.out.println(coll.count());
} 
	
	public static void queryDoc(MongoDatabase db){
		MongoCollection<Document> coll = db.getCollection("names");	
		Document doc=coll.find().first();   //query first document in collection
		System.out.println(doc.toJson());
		
		  MongoCursor<Document> cursor=coll.find().iterator();  //query all documents in collection
		  while(cursor.hasNext()){
			  System.out.println(cursor.next());
		  }

		  cursor.close();
	}
	
	
	public static void deleteDoc(MongoDatabase db){
		MongoCollection<Document> coll = db.getCollection("names");	
			Document doc = new Document();
		doc.append("name", "op");
		coll.deleteOne(doc);
		System.out.println(coll.count());
	}
	
	public static void UpdateDoc(MongoDatabase db){
		MongoCollection<Document> coll = db.getCollection("names");	
		Document doc = new Document();
		doc.put("name","Reyan");
		Document docnew = new Document();
		docnew.put("name","Rohit");
		coll.updateOne(doc,new Document("$set",docnew));
		
		
	}
	public static void main(String a[]){
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		MongoDatabase db = mongoClient.getDatabase("pcat");
				
		MongoIterable<String> colls=db.listCollectionNames();
			for(String s: colls){
			System.out.println(s);
		}
			//insertDoc(db);
			UpdateDoc(db);
			//queryDoc(db);
			//deleteDoc(db);
			
		
		
		
	}
	

	
	
}
