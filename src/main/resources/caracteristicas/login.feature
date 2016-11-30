# language: pt
  @LoginTeste
  
  Funcionalidade: Autenticação de usuário
  	Como um cozinheiro aventureiro
  	Eu quero me logar no Receitas para Solteiros
  	Para cadastrar minhas receitas e receber recomendações
  	
  	
  	Cenario: Testar Login do usuario 		
  		
  		Dado um usuario cadastrato pelo "<usuario>" no sistema
  			| usuario   | email              | senha  |
  			| Teste     | teste01@rps.com.br | teste01| 
  		
  		Quando eu tento autenticar um usuario inserindo seu email <email> e senha <senha>
  			 | email              | senha  | 
  			 | teste01@rps.com.br | teste01|
  			  
  		Entao o sistema enviara uma mensagem de autenticacao: "Login efetuado com sucesso"		  
  		
  		Exemplos:  		
  		| usuario   | email              | senha  | resultado_login |
  		| Teste     | teste01@rps.com.br | teste01| Login efetuado com sucesso | 
  		| Henrique  | henrique@gmail.com | 12345  | Email e/ou senha incorreto | 
  		| Teste     | teste01@rps.com.br | TESTE11| Email e/ou senha incorreto |
  		
