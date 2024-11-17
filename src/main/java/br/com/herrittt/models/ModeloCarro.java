package br.com.herrittt.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModeloCarro {

    @JsonProperty("codigo")
    int codigo;

    @JsonProperty("nome")
    String modelo;
}
