package br.com.herrittt.ApiServices;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.com.herrittt.models.MarcaCarro;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/carros")
@RegisterRestClient(configKey = "fipe-api")
public interface FipeApiCarrosClient {

    @GET
    @Path("/marcas")
    Uni<List<MarcaCarro>> getMarcasCarro();
}