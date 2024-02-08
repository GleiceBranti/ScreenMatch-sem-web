package br.com.estudo.ScreenMatch;

import br.com.estudo.ScreenMatch.principal.Principal;
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
		Principal principal = new Principal();
		principal.exibeMenu();


		//List<DadosTemporada> temporadas = new ArrayList<>();

		//for (int i = 1; i<=dados.totalTemporadas(); i++) {

			//json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6585022c");
			//DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			//temporadas.add(dadosTemporada);
		//temporadas.forEach(System.out::println);


	}
}
