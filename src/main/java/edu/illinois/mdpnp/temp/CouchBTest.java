package edu.illinois.mdpnp.temp;

import java.util.HashMap;
import java.util.Map;

import org.jcouchdb.db.Database;

public class CouchBTest {
	public static void main(String[] args) {
	    // create a database object pointing to the database "mycouchdb" on the local host    
	    Database db = new Database("localhost", "mycouchdb");

	    // create a hash map document with two fields    
	    Map<String,String> doc = new HashMap<String, String>();
	    doc.put("foo", "value for the foo attribute");
	    doc.put("bar", "value for the bar attribute");

	    // create the document in couchdb
	    db.createDocument(doc);
	}
}
