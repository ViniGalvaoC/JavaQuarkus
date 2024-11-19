package br.com.herrittt.Services;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.databind.JsonNode;

import br.com.herrittt.ApiServices.FipeApiCarrosClient;
import br.com.herrittt.models.MarcaCarro;
import br.com.herrittt.models.ModeloCarro;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FipeApiCarrosService {

    @Inject
    @RestClient
    FipeApiCarrosClient fipeApiCarrosClient;

    public List<MarcaCarro> getCarros(){
        return fipeApiCarrosClient.getMarcasCarros().stream().limit(5).toList();
    }

    public JsonNode getModelosById(int id){
        return fipeApiCarrosClient.getModelosById(id);
    }
}
