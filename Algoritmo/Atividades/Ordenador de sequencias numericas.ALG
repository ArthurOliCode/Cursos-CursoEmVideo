Algoritmo "semnome"

Var

Vet: Vetor [1..4] de inteiro
i, c, aux: inteiro

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
   titulo("Bem vindo ao Organizador de números")
   PulaL(1)
   Para i:= 1 ate 4 faca
        Escreva("Digite um número válido positivo: ")
        leia(Vet[i])
        PulaL(1)
   Fimpara
   limpatela
   Escreval("":10, "Sua Lista originalmente está assim: ")
   PulaL(2)
   Para i:= 1 ate 4 faca
        Escreva("":2, "[",Vet[i],"]")
   Fimpara
   PulaL(2)
   Escreval("Ordenando a lista....")
   PulaL(2)
   Para i:= 1 ate 3 faca
        para c:= i + 1 ate 4 faca
             Se (Vet[i] > Vet[c]) entao
                aux <- Vet[i]
                Vet[i] <- Vet[c]
                Vet[c] <- aux
             Fimse
        Fimpara
   Fimpara
   titulo("Sua lista de forma crescente: ")
   para i:= 1 ate 4 faca
        Escreva("":2, "[", Vet[i], "]")
   Fimpara
   PulaL(2)
   Escreval("Saindo.....")
   PulaL(5)
Fimalgoritmo