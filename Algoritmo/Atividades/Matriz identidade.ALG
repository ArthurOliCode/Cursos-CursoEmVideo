Algoritmo "semnome"


Var

M: Vetor[1..10, 1..10] de inteiro
l,c: inteiro


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


titulo("   Matriz Identidade   ")
PulaL(2)
Escreval("----------------------------------------------")
Para l := 1 ate 10 faca
     Escreva("|")
     Para c := 1 ate 10 faca
          Se (c = l) entao
             M[l,c] <- 1
          Fimse
          Escreva(M[l,c]:4)
     Fimpara
     Escreva("":4,"|")
     Escreval()
Fimpara
Escreval("----------------------------------------------")
PulaL(3)
Escreval("Saindo.....")
PulaL(3)


Fimalgoritmo