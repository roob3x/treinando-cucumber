#language en
  @Rob
  Feature: VALIDAR_TEXTO_MENU_LIST_TABLE
    Dado que eu entro na cotacao
    Quando acessar menu list table
    Entao validar primeira posicao do menu list table sort
  Scenario: Realizar validacao do list table sort
    Given abrir home cotacao seleniumeasy
    And fechar alerta learn selenium
    And acessar menu list table sort
    Then validar que a primeira posicao contem "Junior Technical Author"