package br.edu.ifes.rps.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", tags= "@LoginTeste",
glue = "br.edu.ifes.rps.teste.passos", monochrome = true, dryRun = false)
public class LoginTeste {

	
// src/main/resources/caracteristicas
//	classpath:caracteristicas
}
/*O sistema deve prover a autenticacao dos usuarios de forma correta, seguindo os seguintes principios e restricoes:
	1) A autenticacao so estara correta se o email e a senha coincidiram com a cadastrada no sistema;*/