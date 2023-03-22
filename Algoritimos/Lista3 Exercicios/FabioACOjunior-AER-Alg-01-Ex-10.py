'''Supondo que as letras indicadas no tabuleiro de sao os numeros de 1 a 8 respectivamente'''''
linha = int(input("Digite o numero da linha:"))
coluna = int(input("Digite o numero da coluna"))
if (linha + coluna) % 2 == 0:
    print("Este quadrado é preto")
else:
    print("Este quadrado é branco")