package testPackage;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;


public class APITest1 {
	
	private static GetRequest get = null;
	
	//GET methods
	public static String performGetRequest(String url) {
		setUrlForGET(url);
		try {
			return get.asString().getBody();
		} catch (UnirestException e) {
			System.err.println("Unable to perform GET and return String: " + e);
			return null;
		}
	}
	
	
	public static void setUrlForGET(String url) {
		get = null;
		get = Unirest.get(url);
	}
	
	
	public static JsonObject performGetReturnJSON() {
		JsonParser parser = new JsonParser();
		try {
			String response = get.asJson().getBody().toString();
			//System.out.println("Response from perrformGetReturnJSON: " + response);
			return parser.parse(response).getAsJsonObject();
		} catch (UnirestException e) {
			System.err.println("Unable to perform GET and return JSON: " + e);
			return null;
		}
	}
		
	public static void setHeaderForGET(String name, String value) {
		if (get != null)
			get.header(name, value);
		else
			System.err.println("Set GET URL before HEADERS");
	}


}
