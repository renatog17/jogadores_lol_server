package champslol.champslol;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/campeoes")
@CrossOrigin(maxAge = 3600)
@RestController
public class ControllerChamps {

	@GetMapping
	public ResponseEntity<?> listarCampeoes(){
		List<String> campeoes = new Repositorio().listaCampeoes();
		return ResponseEntity.ok(campeoes);
	}
}
