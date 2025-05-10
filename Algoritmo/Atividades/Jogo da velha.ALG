Algoritmo "semnome"

Var


M: vetor[1..3, 1..3] de caractere
l, c, cont_P, ganha_X, ganha_O: inteiro
resp, condicao, jogada_X, jogada_O: caractere



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



Procedimento posicao_X()

Inicio
      Escreva("Em qual posição deseja jogar o 'X'?:  ")
      leia(jogada_X)
Fimprocedimento


Procedimento posicao_O()
Inicio
      Escreva("Em qual posicao deseja jogar o 'O'?:  ")
      leia(jogada_O)
Fimprocedimento


Procedimento jogo_da_Velha(X: caractere)
inicio
      Se (X = jogada_X) entao
         Para l := 1 ate 3 faca
                Para c := 1 ate 3 faca
                     Se (M[l, c] = X) entao
                         M[l, c] <- "X"
                     Fimse
                Fimpara
         Fimpara
      Senao
           Se (X = jogada_O) entao
              Para l := 1 ate 3 faca
                   Para c := 1 ate 3 faca
                        Se (M[l, c] = X) entao
                            M[l, c] <- "O"
                        Fimse
                    Fimpara
              Fimpara
           Fimse
      Fimse
      Escreval("":4, "-------------------------------")
      Para l := 1 ate 3 faca
           Escreva("":4, "|")
           Para c := 1 ate 3 faca
                Escreva("":4, "|", M[l, c], "°", "|":2)
           Fimpara
           Escreva("":2, "|")
           Escreval()
      Fimpara
      Escreval("":4, "-------------------------------")
      Para l := 1 ate 3 faca
           Para c := 1 ate 3 faca
              Se (M[l, c] = "X") entao
                 ganha_X <- ganha_X + 1
              Senao
                   Se (M[l, c] = "O") entao
                      ganha_O <- ganha_O + 1
                   Fimse
              Fimse
           Fimpara
      Fimpara
Fimprocedimento

Procedimento PulaL(X: inteiro)
Inicio

      Para C:=1 ate X faca
        Escreval()
      Fimpara

Fimprocedimento

Procedimento Jogo()
Inicio
      Se (cont_P % 2 = 1) entao
         posicao_X()
         jogo_da_Velha(jogada_X)
      Senao
           Se (cont_P % 2 = 0) entao
              posicao_O()
              jogo_da_Velha(jogada_O)
           Fimse
      Fimse
      Se (ganha_X = 3) ou (ganha_O = 3) entao
         Interrompa
      Fimse
Fimprocedimento

Inicio


cont_P <- 1
M[1, 1] <- "1"
M[2, 1] <- "2"
M[3, 1] <- "3"
M[1, 2] <- "4"
M[2, 2] <- "5"
M[3, 2] <- "6"
M[1, 3] <- "7"
M[2, 3] <- "8"
M[3, 3] <- "9"


titulo("  Jogo da velha  ")
      PulaL(2)
      Escreval("":4, "-------------------------------")
      Para l := 1 ate 3 faca
           Escreva("":4, "|")
           Para c := 1 ate 3 faca
                Escreva("":4, "|", M[l, c], "°", "|":2)
           Fimpara
           Escreva("":2, "|")
           Escreval()
      Fimpara
      Escreval("":4, "-------------------------------")
      PulaL(4)
Repita
      jogo()
      cont_P <- cont_P + 1
      Se (ganha_X = 3) entao
         interrompa
      Senao
           Se (ganha_O = 3) entao
              interrompa
           Fimse
      Fimse
Ate (cont_P >= 7)
Fimalgoritmo