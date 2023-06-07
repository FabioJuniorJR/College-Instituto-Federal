import time
import random
vetorEmbaralhado = []
vetorOrdenado = []

class Busca:

    def criaVetoresEmbaralhados(n):  
        valor = random.sample(range(1000000000),  n)
        vetorEmbaralhado.append(valor)
        #print(valor)

    def criaVetoresOrdenados(n):
        i = 0
        while i < n:
            vetorOrdenado.append(i)
            i = i + 1
            
        '''for valores in vetor2:
            print(valores)'''

    def busca_binaria(valor):
        pass

    def busca_linear(valor):
        tempo_inicial = (time.time())
        for i in vetorOrdenado:
            if i == valor:
                condicao = True
                print("valor encontrado")
        tempo_final = (time.time())
        tempo_levado = tempo_final - tempo_inicial
        if condicao == False:
            print("valor não encontrado")
        print("Tempo levado na busca linear: ", tempo_levado)

    print("-------------------------")
    qtdeElementos = int(input("Digite a quantidade de elementos da lista: "))
    print("Dados armazenados com sucesso!!!")
    print("-------------------------")
    #criaVetoresEmbaralhados(qtdeElementos)
    criaVetoresOrdenados(qtdeElementos)
    print("-------------------------")
    valorBuscaLinear = int(input("Digite o valor que deseja buscar: "))
    busca_linear(valorBuscaLinear)
    print("-------------------------")
    
