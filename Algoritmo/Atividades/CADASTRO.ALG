Algoritmo "Cadastro"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var

   sexo, tipoc, tonalidade_c, R:  caractere
   idade, M_esp, F_esp, M, F, adulto, adulta, castanho, loira: inteiro
   
Inicio
      M_esp <- 0
      F_esp <- 0
      
      REPITA
          adulto <- 0
          adulta <- 0
          M <- 0
          F <- 0
          Escreval("Qual o sexo do individual? (Escreva por extenso):  ")
          Escreval()
          Escreval("-----------------------------")
          Escreval("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
          Escreval()
          Escreval("[1] Masculino")
          Escreval("[2] Feminino")
          Escreval("[3] Outros")
          Escreval()
          Escreva("-> ")
          leia(sexo)
          Se (sexo = "Masculino") entao
             M <- 1
          Senao
               Se (sexo = "Feminino") entao
                  F <- 1
               Fimse
          Fimse
          
          Escreval()
          Escreval("Informe a idade da pessoa em respectivo:  ")
          Escreva("-> ")
          leia(idade)
          Se (idade >= 18) e (M = 1) entao
             adulto <- 1
          Senao
               se (idade >= 25) e (idade <= 30) e (F = 1)entao
                  adulta <- 1
               Fimse
          Fimse
          Escreval()

          Escreval("Informe o tipo de cabelo que ela possuí (Informe por extenso):  ")
          Escreval("----------------------------------------")
          Escreval("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
          Escreval()
          Escreval("[1] Crespo ")
          Escreval("[2] Cacheado")
          Escreval("[3] Ondulado")
          Escreval("[4] Liso")
          Escreval("[5] Calvo")
          Escreval("[6] Não possuí cabelo")
          Escreval()
          Escreva("-> ")
          leia(tipoc)

          Escreval()
          Escreval("Informe a tonalidade capilar da pessoa (Escreva por extenso): ")
          Escreval()
          Escreval("-------------------------------------")
          Escreval("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
          Escreval()
          Escreval("[1] Castanho")
          Escreval("[2] Colorido")
          Escreval("[3] Loiro")
          Escreval("[4] Ruivo")
          Escreval("[5] Preto")
          Escreval()
          Escreva("-> ")
          leia(tonalidade_c)
          Se (tonalidade_c = "Castanho") e (adulto = 1) entao
             M_esp <- M_esp + 1
          Senao
               Se (tonalidade_c = "Loiro") e (adulta = 1) entao
                  F_esp <- F_esp + 1
               Fimse
          Fimse

          Escreval()
          Escreval("Deseja continuar a registrar pessoas? [N/S]: ")
          Escreva("-> ")
          leia(R)
          Se (R = "S") entao
             limpatela
          Fimse
      ATE (R = "N")
      Escreval()
      Escreval("Saindo.....")
      Limpatela
      Escreval("______________________")
      Escreval("______________________")
      Escreval()
      Escreval("     Resultados")
      Escreval("______________________")
      Escreval("______________________")
      Escreval()
      Escreval("1° Total de Homens com 18 anos ou mais, castanhos é igual a ", M_esp, " !!")
      Escreval()
      Escreval("2° Total de Mulheres entre 25 e 30 anos, loiras é igual a ", F_esp, " !!")
      
       

Fimalgoritmo