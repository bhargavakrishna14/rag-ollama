package com.example.rag.ollama;

import org.springframework.boot.SpringApplication;

public class TestRagOllamaApplication {

	public static void main(String[] args) {
		SpringApplication.from(RagOllamaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
