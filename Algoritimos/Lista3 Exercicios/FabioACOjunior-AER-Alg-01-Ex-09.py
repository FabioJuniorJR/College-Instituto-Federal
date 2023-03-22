dia = int(input("Digite um dia do ano:"))
mes = int(input("Digite um mes do ano:"))
if dia == 1 and mes == 1:
    print("Neste data 01/01 é feriado da confraternização universal.")
elif dia == 21 and mes == 4:
    print("Neste data 21/04 é feriado nacional de tiradentes.")
elif dia == 1 and mes == 5:
    print("Neste data 01/05 é feriado nacional do dia do trabalho.")
elif dia == 7 and mes == 9:
    print("Neste data 07/09 é feriado nacional da Independencia do Barsil.")
elif dia == 12 and mes == 10:
    print("Neste d 12/10 é feriado nacional de Nossa Senhora Aparecida.")
elif dia == 2 and mes == 11:
    print("Neste dia 02/11 é feriadp nacional de finados.")
elif dia == 15 and mes == 11:
    print("Neste dia 15/11 é feriado nacional da Proclamação da Republica.")
elif dia == 25 and mes == 12:
    print("Neste dia 25/12 é feriado nacional de Natal.")
else:
    print("O dia e mes informado nao correspondem a nenhum feriado nacional com data fixa.")