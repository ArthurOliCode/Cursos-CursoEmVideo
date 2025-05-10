Algoritmo "Contagem"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var

   Contador, valor, salto, condicao, maior, menor, cont_crescente: inteiro
   escol, continuar: caractere
   

Procedimento titulo(X: caractere)
Var
contador: inteiro

Inicio
Escreval()
Para contador := 0 ate (compr(X) * 2) faca
     Escreva("-")
Fimpara
Escreval()
Para contador := 0 ate (compr(X) \ 2) faca
     Escreva(" ")
Fimpara
Escreva(X)
Escreval()
Para contador := 0 ate (compr(X) * 2) faca
     Escreva("-")
Fimpara
Escreval()
Fimprocedimento



Inicio


Titulo("Bem vindo a contagem!!")

continuar <- "Sim"
condicao <- 0


Enquanto (continuar = "Sim") ou (continuar = "sim") faca
      Escreval()
      Se (condicao >= 1) entao
          Escreval("Deseja continuar?: ")
          leia(continuar)
          Se (continuar = "Não") ou (continuar = "não") ou (continuar = "N") ou (continuar = "n") entao
             interrompa
          Fimse
      Fimse
      Escreval ("Você deseja uma contagem crescente ou decrescente?: ")
      leia(escol)
      Escreval()
      Escreval ("Até que número deseja contar?: ")
      leia(valor)
      Escreval()
      Escreval ("Qual seria o salto de um digíto para o outro na contagem?: ")
      leia(salto)
      Escreval()
      titulo("Inicio do Programa!!")
      Se (escol = "crescente") entao
         Escreval("De que número gostaria de começar a sequência?: ")
         leia(cont_crescente)
         Escreval()
         contador <- cont_crescente
         maior <- valor
         menor <- cont_crescente
         Enquanto (contador <= valor) faca
                  Escreval(contador)
                  Escreval()
                  Se (contador >= maior) entao
                     maior <- (contador)
                  Senao
                       Se (contador <= menor) entao
                          menor <- contador
                       Fimse
                  Fimse
                  contador <- contador + salto
         Fimenquanto
      Senao
           Se (escol = "decrescente") entao
              Escreval()
              Escreval("Desejaria começar com qual número na contagem regressiva?:  ")
              leia(contador)
              Enquanto (contador <= 0) faca
                       Escreval("Incorreto!! Por favor digite um número diferente de 0: ")
                       leia(contador)
              Fimenquanto
              Escreval()
              menor <- contador
              maior <- contador
              Enquanto (contador >= valor) faca
                       Escreval(contador)
                       Escreval()
                       Se (contador > maior) entao
                          maior <- contador
                       Senao
                            Se (contador < menor) entao
                               menor <- contador
                            Fimse
                       Fimse
                       contador <- contador - salto
              Fimenquanto
           Fimse
      Fimse
      Escreval ("O maior número da Sequência foi ", maior)
      Escreval ("O menor número da Sequência foi ", menor)
      menor <- 0
      maior <- 0
      condicao <- condicao + 1
Fimenquanto
Escreval("-----------------------------------")
Fimalgoritmo