Algoritmo "semnome"

Var


Procedimento titulo(X: caractere)
Var

   C, tamanho: inteiro
Inicio

     tamanho:= compr(X) \ 2
     Escreval()
     Para C:= 0 ate (compr(X) * 2) faca
          Escreva("-")
     Fimpara
     Escreval()
     Escreval("":tamanho, X)
     Para C:= 0 ate (compr(X) * 2) faca
          Escreva("-")
     Fimpara
     Escreval()
     Escreval()
Fimprocedimento


Procedimento PulaL(X: inteiro)
Var

C:inteiro

Inicio

      Para C:=1 ate X faca
        Escreval()
      Fimpara

Fimprocedimento



Inicio
titulo("Bem vindo ao meu Software")
PulaL(2)

Fimalgoritmo