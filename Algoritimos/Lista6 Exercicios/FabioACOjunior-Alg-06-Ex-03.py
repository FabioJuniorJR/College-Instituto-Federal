'''Removendo extremos. Ao analisar os dados coletados como parte de um experimento
científico, pode ser desejável remover os valores mais extremos antes de realizar outros
cálculos. Escreva uma função que tenha uma lista de valores e um número inteiro não
negativo, n, como seus parâmetros. A função deve criar uma nova cópia da lista com os n
maiores elementos e os n menores elementos removidos. Em seguida, ele deve retornar a
nova cópia da lista como o único resultado da função. A ordem dos elementos na lista
retornada não precisa coincidir com a ordem dos elementos na lista original.
    Escreva um programa principal que demonstre sua função. Sua função main deve ler uma lista
de números do usuário e remover os dois maiores e os dois menores valores dela. Exiba a
lista com os extremos removidos, seguido pela lista original. Seu programa deve gerar uma
mensagem de erro apropriada se o usuário inserir menos de 4 valores.'''
def linhaDivisoriPrint():
    print("---------------------------------------------------")
    
def eliminaExtremos():
    del numList[0]
    del numList[-1]
    print("A lista alterada ficou: ", numList)


    
numList = []
num = None
contagem = 0
while num != 'sair':
    if contagem == 4:
        break
    num = input("Digite um numero inteiro positivo ou negativo ou press sair e digite mais de 4 numeros:")
    if num.isnumeric():
        numList.append(num)
        contagem += 1
    else:
        linhaDivisoriPrint()
        print("!!! Erro !!! Letras e simbolos nao devem ser diditados")
        print("Um numero deve ser digitado")
        linhaDivisoriPrint()
listCopiaOriginal = []
listCopiaOriginal = numList
print("A lista original era: ", listCopiaOriginal)
eliminaExtremos()