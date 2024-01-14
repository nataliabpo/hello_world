package com.generation.helloworld.GoalsController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goals")

public class GoalsController {
	  @GetMapping
	public String Objetivos () {
		return "Responsabilidade Pessoal, manter minhas atividades em dia,"
				+"\n Persistência, para realizar as atividades,"
				+"\n Comunicação, comunicar minhas dúvidas";
	}

}
