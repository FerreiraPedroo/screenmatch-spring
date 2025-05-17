package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.model.DadosSerie;
import br.com.alura.ScreenMatch.service.ConsumoApi;
import br.com.alura.ScreenMatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("# INICIO");
		String urlApi = "http://www.omdbapi.com/?apikey=23c571cf&t=gilmore+girlS";
		
		ConsumoApi consumo = new ConsumoApi();
		String json = consumo.obterDados(urlApi);
		
		System.out.println(json);
		
		ConverteDados conversor = new ConverteDados();
		
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		
	}
}
