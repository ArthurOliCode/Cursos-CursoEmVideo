Algoritmo "Sequência de Fibonacci"

Var
    C, final, A, B, T3, contaLinha : inteiro
    R: caractere


   Procedimento Titulo(X: Caractere)
   Inicio
         Escreval("---------------------------------")
         Escreval("      ", X)
         Escreval("---------------------------------")
         Escreval()
         Escreval()
   Fimprocedimento
   
   
   Procedimento fibonacci()
   Inicio
         Escreval("Até que termo da sequência de fibonacci gostaria de saber?: ")
         Escreval()
         Escreva("-> ")
         leia(Final)
         Escreval()
         A := 0
         Escreva(" ", A," ")
         B := 1
         Escreva(" ", B," ")
         Para c := 3 ate Final faca
              T3 := B + A
              escreva(" ",  T3," ")
              A := B
              B := T3
         Fimpara
         Escreval()
         Escreval("_________________________________")
         Escreval()
   Fimprocedimento
   
   
    Procedimento PulaL(X: inteiro)
    Inicio
    
          Para contaLinha := 0 ate X faca
               Escreval()
          Fimpara
          
    Fimprocedimento


Inicio
      Titulo("Sequencia de fibonacci")
      Repita
      fibonacci()
      PulaL(1)
      Escreval("Gostaria de continuar?: [N/S]  ")
      Escreva("-> ")
      leia(R)
      Se (R = "S") entao
         limpatela
      Fimse
      PulaL(2)
      Ate (R = "N")
      Escreval("Saindo......")
      PulaL(2)
Fimalgoritmo