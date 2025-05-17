package br.com.alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// IGNORA AS PROPRIEDADES QUE NÃO ESTÃO MAPEADAS.
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
						 @JsonAlias("totalSeasons") Integer totalTemporadas,
						 @JsonAlias("imdbRating") String avalicao) {
}

// o JSON ALIAS PODE RECEBER UM ARRAY @JsonAlias({"NOME", "NOME2"}) QUE PODE BUSCAR NOS CAMPOS QUE ESTA RECEBENDO POR UM DESSES NOME PARA DESSERIALIZAR.
// O JSON ALIAS ELE SÓ DESSERIALIZA O ATRIBUTO INFORMADO PARA O CAMPO DESEJADO.

//O JSON PROPERTY ELE SERIALIZA E DESSERIALIZA O ATRIBUTO "votos" PARA O NOME QUE É INFORMADO NELE.
//						 @JsonProperty("imdbVotes") String votos) {
