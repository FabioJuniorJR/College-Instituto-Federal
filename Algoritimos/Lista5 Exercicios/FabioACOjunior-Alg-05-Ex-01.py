'''Hipotenusa. Escreva uma função que recebe como parâmetros os comprimentos dos dois
lados menores de um triângulo retângulo. A função deve retornar como resultado o
comprimento da hipotenusa, calculado com o Teorema de Pitágoras. Inclua um programa
principal (função main) que solicite ao usuário os comprimentos dos lados, utilize sua função
para calcular a hipotenusa e imprima o resultado.'''
def main():
    cateto1 = float(input("Digite o valor do cateto1:"))
    cateto2 = float(input("Digite o valor do cateto2:"))
    hipotenusa = (cateto1 **2 + cateto2 **2) **(1/2)
    '''return "O valor da hipotenusa é de:", hipotenusa'''
    print("O valor da hipotenusa é de:", hipotenusa)

main()