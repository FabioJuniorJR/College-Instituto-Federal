'''1. Unidades de tempo. Crie um programa Python que leia do usuário um valor de intervalo de
tempo expresso em número de dias, horas, minutos e segundos. O programa deve computar e
exibir a quantidade total de segundos deste intervalo de tempo informado.'''
dias = float(input("Digite um intervalo de tempo em dias:"))
horas = float(input("Digite um intervalo de tempo em horas:"))
minutos = float(input("Digite um intervalo de tempo em minutos:"))
segundos = float(input("Digite um intervalo de tempo em segundos:"))

diaSeg = (((dias * 24) * 60) * 60)
horaSeg = ((horas * 60) * 60)
minSeg = minutos * 60
totalSegPeriodo = diaSeg + horaSeg + minSeg
print("---------------------------------")
print(dias, "dias tem", diaSeg,"segundos")
print(horas, "horas tem", horaSeg,"segundos")
print(minutos, "minutos tem", minSeg,"segundos")
print("---------------------------------")
print("O total de segundos deste peiodo é de:", totalSegPeriodo,"segundos")