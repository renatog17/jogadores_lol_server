package champslol.champslol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import champslol.champslol.controller.dto.FormJogador;
import champslol.champslol.domain.Jogador;
import champslol.champslol.repositories.JogadorRepository;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

	@Autowired
	private JogadorRepository jogadorRepository;
	
	@PostMapping
	public ResponseEntity<?> cadastrarJogador(@RequestBody FormJogador formJogador){
		Jogador jogador = new Jogador(formJogador);
		jogadorRepository.save(jogador);
		return null;
	}
}
