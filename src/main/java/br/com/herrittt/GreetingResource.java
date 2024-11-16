package br.com.herrittt;

import java.lang.annotation.ElementType;
import java.util.List;

import javax.swing.text.html.parser.Element;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.herrittt.ApiServices.FipeApiCarrosClient;
import br.com.herrittt.Services.FipeApiCarrosService;
import br.com.herrittt.models.MarcaCarro;
import io.smallrye.mutiny.Uni;
import io.vertx.codegen.doc.Text;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;


@Path("/hello")
public class GreetingResource {

    @Inject
    FipeApiCarrosService fipeApiCarrosService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response carros() {
        try {
        var carros =  fipeApiCarrosService.getCarros();
        ObjectMapper mapper = new ObjectMapper();
        String jsoString = mapper.writeValueAsString(carros);
        return Response.ok(jsoString).build();
        }catch(Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }

    }
}
