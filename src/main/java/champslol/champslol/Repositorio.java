package champslol.champslol;

import java.util.Arrays;
import java.util.List;

public class Repositorio {

	private List<String> campeoes = Arrays.asList("Ahri", "Camille", "Darius", "Morgana", "Pantheon","Warwick", "Zac");
	
	public List<String> listaCampeoes() {
		return this.campeoes;
	}
}
