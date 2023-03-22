'''Números ordinais. Palavras como primeiro, segundo e terceiro são chamadas de números
ordinais. Neste exercício, você deve escrever uma função que recebe um inteiro como seu
único parâmetro e retorna uma string contendo o número ordinal em português como seu
único resultado. Sua função deve lidar com números inteiros entre 1 e 12 (inclusive). Ela deve
retornar uma string vazia se um valor fora desse intervalo for fornecido como um parâmetro.
Inclua um programa principal que demonstra sua função exibindo cada inteiro de 1 a 12 e seu
respectivo número ordinal.'''
def linhaDivisoria():
    print("--------------------------------------------------")

def numOrdinal(numStr):
    if numStr == '1':
        linhaDivisoria()
        print("A forma ordinal do numero 1 é: primeiro")
        linhaDivisoria()
    elif numStr == '2':
        linhaDivisoria()
        print("A forma ordinal do numero 2 é: segundo")
        linhaDivisoria()
    elif numStr == '3':
        linhaDivisoria()
        print("A forma ordinal do numero 3 é: terceiro")
        linhaDivisoria()
    elif numStr == '4':
        linhaDivisoria()
        print("A forma ordinal do numero 4 é: quarto")
        linhaDivisoria()
    elif numStr == '5':
        linhaDivisoria()
        print("A forma ordinal do numero 5 é: quinto")
        linhaDivisoria()
    elif numStr == '6':
        linhaDivisoria()
        print("A forma ordinal do numero 6 é: sexto")
        linhaDivisoria()
    elif numStr == '7':
        linhaDivisoria()
        print("A forma ordinal do numero 7 é: setimo")
        linhaDivisoria()
    elif numStr == '8':
        linhaDivisoria()
        print("A forma ordinal do numero 8 é: oitavo")
        linhaDivisoria()
    elif numStr == '9':
        linhaDivisoria()
        print("A forma ordinal do numero 9 é: nono")
        linhaDivisoria()
    elif numStr == '10':
        linhaDivisoria()
        print("A forma ordinal do numero 10 é: decimo")
        linhaDivisoria()
    elif numStr == '11':
        linhaDivisoria()
        print("A forma ordinal do numero 11 é: decimo primeiro")
        linhaDivisoria()
    elif numStr == '12':
        linhaDivisoria()
        print("A forma ordinal do numero 12 é: decimo segundo")
        linhaDivisoria()
    else:
        linhaDivisoria()
        print("Numero fora do limite de 1 a 12:", " ")
        linhaDivisoria()

linhaDivisoria()
numInt = int(input("Digite um numero de 1 a 12:"))
numStr = str(numInt)
numOrdinal(numStr)