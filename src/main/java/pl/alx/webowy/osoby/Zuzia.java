package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/zuzia")
public class Zuzia {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Zuzia</title>
		</head>
		<body>
		<p>Jestem <strong>Zuzia</stong></p>
		</body>
		</html>
		""";
	}
}
