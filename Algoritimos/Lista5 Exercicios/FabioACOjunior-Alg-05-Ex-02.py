'''Tarifa do táxi. Em uma determinada cidade, as tarifas de táxi consistem em um valor inicial de
R$ 4,00 mais R$ 0,25 a cada 140 metros percorridos. Escreva uma função que recebe como
seu único parâmetro a distância percorrida em quilômetros, e retorna como seu único
resultado o valor total da corrida. Escreva um programa principal que demonstre o
funcionamento de sua função.
Dica: as tarifas de táxi mudam com tempo. Utilize constantes para representar o preço
inicial e a parte variável da tarifa de forma que o programa possa ser facilmente atualizado
caso os valores de tarifa sofram aumento.'''
import random
def calculaValor(distancia):
    valorFixo = float(input("Digite o valor fixo de hoje:"))
    valorVariavel = float(input("Digite o valor variavel de hoje:"))
    valorCorrida = valorFixo + (valorVariavel * distancia)
    print("O valor total da corrida é de:", valorCorrida)
    
distancia = random.randint(1,100000)
calculaValor(distancia)

