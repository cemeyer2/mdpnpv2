package edu.illinois.mdpnp.json;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import edu.illinois.mdpnp.conditions.Condition;
import edu.illinois.mdpnp.conditions.LessThan;

public class SerializerDriver {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Comparable source = "sourceObject";
		Comparable target = new Double(123.56);
		
		Condition condition = new LessThan(source, target);
		
		String json = JSONSerializer.toJSON(condition);
		
		System.out.println(json);
	}

}
