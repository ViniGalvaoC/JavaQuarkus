package br.com.herrittt.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarcaCarro{

    @JsonProperty("codigo")
    String codigo;

    @JsonProperty("nome")
    String marca;
}
