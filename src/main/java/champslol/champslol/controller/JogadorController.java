package champslol.champslol.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import champslol.champslol.controller.dto.FormJogador;
import champslol.champslol.domain.Jogador;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

	@PostMapping
	public ResponseEntity<?> cadastrarJogador(@RequestBody FormJogador formJogador){
		Jogador jogador = new Jogador(formJogador);
		
		return null;
	}
}
