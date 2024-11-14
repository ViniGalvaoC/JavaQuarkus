package br.com.herrittt;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.herrittt.ApiServices.FipeApiCarrosClient;
import br.com.herrittt.models.MarcaCarro;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@ApplicationScoped
@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    FipeApiCarrosClient fipeApiCarrosService;

    @GET
    public Uni<List<MarcaCarro>> carros() {
        return fipeApiCarrosService.getMarcasCarro();
    }
}
