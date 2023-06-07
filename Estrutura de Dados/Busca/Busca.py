import time
import random
vetorEmbaralhado = []


class Busca:

    def criaVetoresEmbaralhados(n):
        vetorEmbaralhado = []
        valor = random.sample(range(1000000000),  n)
        vetorEmbaralhado.append(valor)
        return vetorEmbaralhado
        # print(valor)

    def criaVetoresOrdenados(n):
        vetorOrdenado = []
        i = 0
        while i < n:
            vetorOrdenado.append(i)
            i = i + 1
        return vetorOrdenado

        '''for valores in vetor2:
            print(valores)'''

    def busca_binaria(vetor, valor):
        inicio = 0
        fim = len(vetor) - 1
        tempo_inicial = (time.time())
        while inicio <= fim:
            meio = int((inicio + fim) / 2)
            if valor < vetor[meio]:
                fim = meio - 1
            elif valor > vetor[meio]:
                inicio = meio + 1
            else:
                print("Elemento encontrado")
                tempo_final = (time.time())
                tempo_levado = (tempo_final - tempo_inicial)
                print("Tempo levado na busca binaria: ", tempo_levado)
                return meio
        print("Elemento nao encontrado")
        tempo_final = (time.time())
        tempo_levado = (tempo_final - tempo_inicial)
        print("Tempo levado na busca binaria: ", tempo_levado)
        return -1

    def busca_linear(vetor, valor):
        tempo_inicial = (time.time())
        for i in vetor:
            if i == valor:
                condicao = True
                print("valor encontrado")
        tempo_final = (time.time())
        tempo_levado = (tempo_final - tempo_inicial) / 1000
        if condicao == False:
            print("valor não encontrado")
        print("Tempo levado na busca linear: ", tempo_levado)

    print("-------------------------")
    qtdeElementos = int(input("Digite a quantidade de elementos da lista: "))
    print("Dados armazenados com sucesso!!!")
    print("-------------------------")
    # criaVetoresEmbaralhados(qtdeElementos)
    vetor1 = criaVetoresOrdenados(qtdeElementos)
    print("-------------------------")
    valorBusca = int(input("Digite o valor que deseja buscar: "))
    busca_linear(vetor1, valorBusca)
    print("-------------------------")
    busca_binaria(vetor1, valorBusca)
