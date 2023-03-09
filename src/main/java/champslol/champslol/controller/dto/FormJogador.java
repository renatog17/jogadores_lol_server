package champslol.champslol.controller.dto;

import java.util.ArrayList;

import champslol.champslol.controller.dto.enums.Divisao;
import champslol.champslol.controller.dto.enums.Role;
import champslol.champslol.controller.dto.enums.Tier;

public record FormJogador(
		String nome, 
		String nickname, 
		Divisao divisao, 
		Tier tier, 
		String imagem,
		ArrayList<String> campeoes, 
		Role rolePrimaria, 
		Role roleSecundaria) {

}
