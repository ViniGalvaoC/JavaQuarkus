package br.com;

import java.io.InputStream;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.herrittt.ApiServices.FipeApiCarrosClient;
import br.com.herrittt.Services.FipeApiCarrosService;
import jakarta.inject.Inject;

public class Main {

    @Inject
    FipeApiCarrosService fipeApiCarrosService;

    public static void main(String[] args) {     
        InputStream is = System.in;
        System.out.println();
        System.out.println("teste");

    }
}
