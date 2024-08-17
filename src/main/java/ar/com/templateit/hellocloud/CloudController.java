package ar.com.templateit.hellocloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CloudController {
	
	@GetMapping("/saludar")
	public String saludar() {
		String saludo = "Hola saludando desde el cloud";
		return saludo;
	}

}
