package br.com.herrittt.ApiServices;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fasterxml.jackson.databind.JsonNode;

import br.com.herrittt.models.MarcaCarro;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/carros")
@RegisterRestClient(configKey = "fipe-api")
public interface FipeApiCarrosClient {

    @GET
    @Path("/marcas")
    @Produces(MediaType.APPLICATION_JSON)
    List<MarcaCarro> getMarcasCarros();
}