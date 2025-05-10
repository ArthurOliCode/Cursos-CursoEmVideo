Algoritmo "semnome"

Var
SoletraA: Vetor[1..10] de caractere
ListaN: Vetor[1..10] de caractere
tot, i, NomesG: inteiro
Nome: caractere

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
      tot := 0
      NomesG:= 0
      titulo("Bem vindo a lista de nomes reservados!!")
      PulaL(2)
      Para i := 1 ate 10 faca
           Escreva("Qual o nome da pessoa:  ")
           leia(Nome)
           Se (copia(minusc(Nome), 1, 1) = "a") entao
                tot := tot + 1
                SoletraA[tot] <- Nome
           Senao
                Se (copia(minusc(Nome), 1, 1) <> "a") entao
                   NomesG := NomesG + 1
                   ListaN[NomesG] <- Nome
                Fimse
           Fimse
           PulaL(2)
      Fimpara
      Limpatela
      titulo("Lista de nomes com 'A' ")
      Para i:= 1 ate tot faca
           Escreval("O ", i, "o. nome é ", SoletraA[i])
      Fimpara
      PulaL(1)
      titulo("Lista de nomes gerais sem 'A' ")
      Para i:= 1 ate NomesG faca
           Escreval("O ", i, "o. nome comum é ", ListaN[i])
      Fimpara
      PulaL(2)
      Escreval("Saindo....")
Fimalgoritmo