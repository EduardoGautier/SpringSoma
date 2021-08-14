package com.example.spring.uri1001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.uri1001.model.Soma;

@RestController
@RequestMapping("/soma")
public class SomaRestController {
	@GetMapping("/")
	public Soma somaNumeros(@RequestParam double a, double b) {
		return new Soma(a, b);
	}
}
