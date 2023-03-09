package champslol.champslol.domain;

import java.util.ArrayList;

import champslol.champslol.controller.dto.FormJogador;
import champslol.champslol.controller.dto.enums.Divisao;
import champslol.champslol.controller.dto.enums.Role;
import champslol.champslol.controller.dto.enums.Tier;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "jogador")
@Table(name = "jogador")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String nickname;
	@Enumerated(EnumType.STRING)
	private Divisao divisao;
	@Enumerated(EnumType.STRING)
	private Tier tier;
	private String imagem;
	@ElementCollection
	private ArrayList<String> campeoes;
	@Enumerated(EnumType.STRING)
	private Role rolePrimaria;
	@Enumerated(EnumType.STRING)
	private Role roleSecundaria;

	public Jogador(FormJogador formJogador) {
		this.nome = formJogador.nome();
		this.nickname = formJogador.nickname();
		this.divisao = formJogador.divisao();
		this.tier = formJogador.tier();
		this.imagem = formJogador.imagem();
		this.campeoes = formJogador.campeoes();
		this.rolePrimaria = formJogador.rolePrimaria();
		this.roleSecundaria = formJogador.roleSecundaria();
	}
}
