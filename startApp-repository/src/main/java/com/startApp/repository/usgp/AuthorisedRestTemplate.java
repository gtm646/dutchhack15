package com.startApp.repository.usgp;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import org.apache.commons.codec.binary.Base64;

/**
 * A factory for creating AuthorisedRestTemplate objects.
 */
public class AuthorisedRestTemplate {
	public RestTemplate getRestTemplate() {

		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory() {
			@Override
			protected void prepareConnection(HttpURLConnection connection, String httpMethod) throws IOException {
				super.prepareConnection(connection, httpMethod);

				String authorisation = "usg" + ":" + "people";
				connection.setRequestProperty("Authorization",
						"Basic " + new String(new Base64().encode(authorisation.getBytes())));
			}
		};
		return new RestTemplate(factory);
	}
}
