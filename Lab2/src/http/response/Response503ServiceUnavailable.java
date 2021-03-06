package http.response;

import http.ServerThread;

public class Response503ServiceUnavailable extends Response {

	public Response503ServiceUnavailable(ServerThread client) {
		super(client, "503 Service Unavailable",
				"The server is currently unavailable because it is down for maintenance.");
	}
}