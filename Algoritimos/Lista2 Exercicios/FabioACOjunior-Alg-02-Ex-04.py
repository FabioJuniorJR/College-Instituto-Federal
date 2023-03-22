'''4. Ordenação de 3 inteiros. Crie um programa que obtém 3 números inteiros do usuário e os
exibe de forma ordenada do menor para o maior. Use as funções min e max para encontrar o
menor valor e o maior valor. Dica: o valor do meio pode ser obtido pela soma dos três valores,
subtraída do maior e do menor.'''
valor1 = int(input("Digite um valor:"))
valor2 = int(input("Digite um valor:"))
valor3 = int(input("Digite um valor:"))
maior = max(valor1, valor2, valor3)
menor = min(valor1, valor2, valor3)
meio = ((valor1 + valor2 + valor3) - (maior + menor))
print(menor, meio, maior)

