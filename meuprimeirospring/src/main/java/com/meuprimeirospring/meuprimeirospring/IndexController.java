package com.meuprimeirospring.meuprimeirospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/teste")
	public String Index() {
		return "index";
	}

}
