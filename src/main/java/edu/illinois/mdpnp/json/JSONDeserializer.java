package edu.illinois.mdpnp.json;

import java.io.IOException;
import java.io.StringReader;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONDeserializer
{
	public static <T> T fromJSON(String json, Class<T> type) throws JsonGenerationException, JsonMappingException, IOException
	{
		StringReader reader = new StringReader(json);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(reader, type);
	}
}
