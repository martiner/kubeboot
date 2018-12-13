package cz.geek.kubeboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeBootController {

	@GetMapping("/")
	public String hello() {
		return "Hello";
	}
}
