Algoritmo "semnome"


Var

M: vetor[1..5, 1..5] de inteiro
l,c, sDP, Produto_l, mai_3c: inteiro


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

Produto_l := 1
titulo("Matriz 5X5 Personalizada")
PulaL(2)
Para l := 1 ate 5 faca
     Para c := 1 ate 5 faca
          Escreva("Digite o valor da posição [", l, ",", c, "]")
          leia(M[l,c])
     Fimpara
Fimpara
limpatela
titulo("   Matriz digitada   ")
PulaL(2)
Escreval("":5, "--------------------------------")
Para l := 1 ate 5 faca
     Escreva("":5, "|")
     Para c := 1 ate 5 faca
          Escreva(M[l,c]:5)
          Se (c = l) entao
             sDP <- sDP + M[l,c]
          Fimse
     Fimpara
     Escreva("":5, "|")
     Escreval()
Fimpara
Para c := 1 ate 5 faca
     Se (M[2,c] <> 0)entao
        Produto_l <- Produto_l * M[2,c]
     Fimse
Fimpara
Para l := 1 ate 5 faca
     Se (M[l,3] > mai_3c) entao
        mai_3c <- M[l,3]
     Fimse
Fimpara
Escreva("":5, "--------------------------------")
PulaL(2)
titulo("   Resultados coletados   ")
PulaL(2)
Escreval("A soma dos valores da diagonal principal da matriz é ", sDP)
Escreval()
Escreval("O produto dos valores da segunda Linha são ", Produto_l)
Escreval()
Escreval("O maior valor da terceira coluna da matriz é ", mai_3c)



Fimalgoritmo