Algoritmo "Matriz Personalizada"


Var

Pares: Vetor[1..5, 1..5] de inteiro
M:vetor[1..5,1..5] de inteiro
l, c, cont_par: inteiro


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


Funcao Par(X: inteiro): inteiro
inicio

Se (X % 2 = 0) entao
   retorne 1
Senao
     retorne 0
Fimse

Fimfuncao



Inicio


cont_Par := 0
titulo("Sistema de Matrizes")
para l := 1 ate 5 faca
     para c := 1 ate 5 faca
          Escreva("Digite o valor da posição [", l, ",", c, "]:  ")
          leia(M[l,c])
          Se (Par(M[l,c]) = 1) e (M[l,c] <> 0) entao
             cont_Par <- cont_Par + 1
             Pares[l,c] <-  M[l,c]
          Fimse
          Escreval()
     Fimpara
Fimpara
limpatela
titulo("Matriz Original Digitada")
PulaL(3)
para l :=1 ate 5 faca
     Escreva("[")
     para c := 1 ate 5 faca
          Escreva(M[l, c]:4)
    Fimpara
    Escreval("":4, "]")
    Escreval()
Fimpara
PulaL(3)
titulo("Contagem de Pares")
Escreval()
Escreval("A quantidade de pares digitados na matriz foi ", cont_Par, " dígitos.")
PulaL(3)
titulo("Matriz de Pares")
PulaL(3)
Para l := 1 ate 5 faca
     Escreva("[")
     Para c := 1 ate 5 faca
          Escreva(Pares[l,c]: 4)
     Fimpara
     Escreval("":4, "]")
     Escreval()
Fimpara
PulaL(3)
Escreval("Saindo.....")
PulaL(3)
Fimalgoritmo