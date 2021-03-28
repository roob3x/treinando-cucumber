#language en

Feature: CADASTRAR_USUARIO
  Como potencial usuario
  Eu quero cadastrar na aplicação
  Para que eu possa ter acesso a funcionalidade que requerem login
  Background: acessar o ambiente


  Scenario Outline:  Realizar cadastrado do usuario
  #Scenario: :  Realizar cadastrado do usuario
    Given  Abrir pagina de cadastro
      And Preencher campo nome com "<nome>"
      And Preencher campo idade com "<idade>"
      And preencher campo senha "<senha>"
      Then validar cadastro realizado com sucesso

   Examples:
    | nome | idade | senha |
    | Roberto| 28|  12345  |
   # | Fulano | 33 | 54321  |



    Scenario Outline:  Realizar cadastrado do usuario
  #Scenario: :  Realizar cadastrado do usuario
      Given  Abrir pagina de cadastro
      And Preencher campo nome com "<nome>"
      And Preencher campo idade com "<idade>"
      And preencher campo senha "<senha>"
      Then validar cadastro realizado com sucesso

