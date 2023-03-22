temperaturaFahrenheit = 0
temperaturaCelcius = float(input("Digite a temperatura em celcius, multiplo de 10 para conversao:"))
verificaMUltiplo = temperaturaCelcius % 10
if verificaMUltiplo != 0:
    print("A temperatura deve ser um multiplo de 10!!!")
else:
    temperaturaFahrenheit = (temperaturaCelcius * 9/5) + 32
    print("A temperatura ",temperaturaCelcius,"C, equivale a",temperaturaFahrenheit,"\t")
    condicao = str(input("Deseja continuar a conversao(sim) ou (nao)?"))
    while condicao != 'nao' and verificaMUltiplo == 0: 
        temperaturaCelcius = float(input("Digite a temperatura em celcius, multiplo de 10 para conversao:"))
        verificaMUltiplo = temperaturaCelcius % 10
        if verificaMUltiplo != 0:
            print("A temperatura deve ser um multiplo de 10!!!")
            continue
        temperaturaFahrenheit = (temperaturaCelcius * 9/5)+ 32
        print("A temertaura ",temperaturaCelcius,"C, equivale a",temperaturaFahrenheit,"\t")
        condicao = str(input("Deseja continuar a conversao(sim) ou (nao)?"))
        