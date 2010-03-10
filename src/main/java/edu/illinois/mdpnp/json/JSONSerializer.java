package edu.illinois.mdpnp.json;

import java.io.IOException;
import java.io.StringWriter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

public class JSONSerializer
{
	public static String toJSON(Object obj) throws JsonGenerationException, JsonMappingException, IOException
	{
		StringWriter writer = new StringWriter();
		ObjectMapper mapper = new ObjectMapper();
		
		SerializationConfig config = mapper.getSerializationConfig();
		config.enable(SerializationConfig.Feature.INDENT_OUTPUT);
		
		mapper.writeValue(writer, obj);
		return writer.toString();
	}
}
