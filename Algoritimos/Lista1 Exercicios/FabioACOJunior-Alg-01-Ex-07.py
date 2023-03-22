'''Soma dos n primeiros números positivos. Escreva um programa Python que receba do
usuário um número inteiro positivo n e então exiba a soma de todos os números inteiros de 1 a
n. Tal soma pode ser computada usando a seguinte fórmula:
soma = (n)(n + 1)
           2'''
n = float(input("Digite um numero inteiro positivo:"))
soma = (n*(n + 1)) /2
print("A soma é de:", soma)