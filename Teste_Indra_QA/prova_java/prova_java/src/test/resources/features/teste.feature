#language: pt
# encoding: utf-8
Funcionalidade: Prova Indra Java BDD

@testePesquisa
Esquema do Cenario: Cadastro
    Dado que foi acessado o site "<site>"
    Quando inserir na pesquisa "diretor avatar"
    E clicar em Pesquisar
    Entao valido o resultado da pesquisa do diretor
    E fecho o navegador
    Exemplos:
        |site                           |   
        |https://www.google.com/        |