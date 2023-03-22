'''Ordem decrescente. Escreva um programa Python que leia números inteiros (do usuário) e
os armazena em uma lista. Seu programa deve continuar lendo inteiros até que o usuário
entre com o valor 0 (zero). Então, o programa deve exibir em ordem decrescente todos os
números digitados pelo usuário sem incluir o valor 0, com um valor em cada linha impressa.'''
listaNum = []
num = None
while num != 0:
    num = int(input("Digite um numero inteiro para armazenar na lista ou 0 para sair:"))
    if num == 0:
        break
    else:
        listaNum.append(num)
listaNum.reverse()
print("Os valores contidos na lista são:",listaNum)