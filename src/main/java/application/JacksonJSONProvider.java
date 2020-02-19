package application;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.SimpleDateFormat;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
/** Activates JACKSON and defines date format */
public class JacksonJSONProvider extends com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider {

  public JacksonJSONProvider() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.setDateFormat(new SimpleDateFormat("dd.MM.yyyy"));
    setMapper(mapper);
  }
}
