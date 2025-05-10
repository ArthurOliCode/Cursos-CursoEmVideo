Algoritmo "semnome"

Var
i, resultado, c: inteiro
v: vetor[1..7] de inteiro





Procedimento PulaL(X: inteiro)

Inicio

Para c := 0 ate X faca
     Escreval()
Fimpara
Fimprocedimento


Procedimento titulo(X: caractere)

inicio
Para c := 0 ate (compr(X) * 2) faca
     Escreva("-")
     Fimpara
     Para c:= 0 ate compr(X) faca
          Escreva(" ")
     Fimpara
     Escreval(x)
     Para c:= 0 ate (compr(X) * 2) faca
          Escreva("-")
     Fimpara
     Escreval()
     Escreval()
      
Fimprocedimento


Funcao epar(X: inteiro): inteiro
       retorne (X % 2)
Fimfuncao




Inicio

   titulo("Bem vindo ao Sistema de contagem!!")
   Escreval()
   Para i:= 1 ate 7 faca
        PulaL(1)
        Escreval("Digite o ", i, "o. número:   ")
        PulaL(1)
        leia(v[i])
   Fimpara
   PulaL(2)
   titulo("Sequência Digitada")
   Para i := 1 ate 7 faca
        Escreva(" [", v[i], "] ")
   Fimpara
   PulaL(4)
   titulo("Resultados de números par!!")
   Para i := 1 ate 7 faca
          resultado <- epar(V[i])
          Se (resultado = 0) entao
             Escreva(V[i], " é par ")
          Fimse
   Fimpara
PulaL(4)
Escreval("Saindo.......")
PulaL(4)

Fimalgoritmo