package core;

import java.net.URI;

public class Endpoints {


	public static Endpoint AEMET ;
	public static Endpoint DBPEDIA ;
	static{
		try{
			AEMET = EndpointFactory.newEndpoint(new URI("http://aemet.linkeddata.es/sparql"));
			DBPEDIA = EndpointFactory.newEndpoint(new URI("http://dbpedia.org/sparql"));
		}catch(Exception e ){

		}
	}
}
