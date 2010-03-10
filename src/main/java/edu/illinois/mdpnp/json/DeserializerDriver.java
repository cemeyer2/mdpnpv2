package edu.illinois.mdpnp.json;

import java.io.IOException;
import java.math.BigDecimal;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import edu.illinois.mdpnp.conditions.AndCondition;
import edu.illinois.mdpnp.conditions.Condition;
import edu.illinois.mdpnp.conditions.LessThan;

public class DeserializerDriver 
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
	{
		Comparable source = "sourceObject";
		Comparable target = new BigDecimal(123.456);
		
		Condition condition = new LessThan(source, target);
		AndCondition and = new AndCondition(condition, condition);
		
		String json = JSONSerializer.toJSON(condition);
		
		LessThan deserialized = JSONDeserializer.fromJSON(json, LessThan.class);
		System.out.println(deserialized.evaluate());
	}

}
