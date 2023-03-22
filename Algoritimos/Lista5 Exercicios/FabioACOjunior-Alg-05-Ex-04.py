'''Mediana de três valores. Escreva uma função que recebe três números como parâmetros e
retorna o valor da mediana desses parâmetros como seu resultado. Inclua um programa
principal que lê três valores do usuário e exibe a mediana destes valores.
Dica: a mediana é o valor do meio dos três valores quando eles são classificados em
ordem crescente. Ela pode ser encontrada usando comandos condicionais ou então com
um pouco de criatividade matemática (veja exercício 4 da lista 2).'''

def mediana(valor1, valor2, valor3):
    maior = max(valor1, valor2, valor3)
    menor = min(valor1, valor2, valor3)
    meio = ((valor1 + valor2 + valor3) - (maior + menor))
    print("A mediana é:", meio)

valor1 = int(input("Digite um valor:"))
valor2 = int(input("Digite um valor:"))
valor3 = int(input("Digite um valor:"))
mediana(valor1, valor2, valor3)