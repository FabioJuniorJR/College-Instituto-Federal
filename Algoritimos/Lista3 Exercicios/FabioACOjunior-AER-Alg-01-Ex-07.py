nivelDB = int(input("Digite o valor de dB:"))
if nivelDB == 130:
    print("O nivel de dB", nivelDB, "equivale a uma britadeira.")
elif nivelDB == 106:
    print("O nivel de dB", nivelDB, "equivale a um cortador de grama.")
elif nivelDB == 70:
    print("O nivel de dB", nivelDB, "equivale a um despertador.")
elif nivelDB == 40:
    print("O nivel de dB", nivelDB, "equivale a uma sala silenciosa.")
elif nivelDB < 130 and nivelDB > 106:
    print("O nivel de dB informado esta entre 130 e 106 que corresponde um nivel dB entre uma britadeira e um cortador de grama.")
elif nivelDB < 106 and nivelDB > 70:
    print("O nivel de dB informado esta entre 106 e 70 que corresponde um nivel dB entre um cortador de grama e um despertador.")
elif nivelDB < 70 and nivelDB > 40:
    print("O nivel de dB informado esta entre 70 e 40 que corresponde um nivel dB entre um despertador e uma sala silenciosa.")
elif nivelDB > 130:
    print("O nivel de dB informado é maior que 130.")
else:
    print("O nivel de dB informado é menor que 40")