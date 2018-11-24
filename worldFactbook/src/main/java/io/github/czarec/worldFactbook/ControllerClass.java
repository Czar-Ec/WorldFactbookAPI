package io.github.czarec.worldFactbook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/factbook")
class ControllerClass {
	
	private static FactbookClass factbook;

	@RequestMapping("/status")
	public String index() {
		return "Online";
	}
}
