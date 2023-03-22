''''Polígono regular. Crie um programa Python que determina e exibe o nome de um polígono
regular sendo fornecida pelo usuário a quantidade de lados. Seu programa deve suportar
polígonos de 3 a 10 lados (inclusive). Caso o usuário forneça valores fora desta faixa, o
programa deve exibir uma mensagem de erro.'''
qtdeLadosPoligono = int(input("Digite a quantidade de lados do poligono:"))
print("Este poligono de", qtdeLadosPoligono, "lados é o: ", end="")
if qtdeLadosPoligono == 3:
    print("Triangulo")
elif qtdeLadosPoligono == 4:
    print("Quadrado")
elif qtdeLadosPoligono == 5:
    print("Pentagono")
elif qtdeLadosPoligono == 6:
    print("Hexagono")
elif qtdeLadosPoligono == 7:
    print("Heptagono")
elif qtdeLadosPoligono == 8:
    print("Octagono")
elif qtdeLadosPoligono == 9:
    print("Eneagono")
elif qtdeLadosPoligono == 10:
    print("Decagono")
elif qtdeLadosPoligono == 11:
    print("Undecagono")
elif qtdeLadosPoligono == 12:
    print("Dodecagono")
elif qtdeLadosPoligono == 15:
    print("Pentadecagono")
elif qtdeLadosPoligono == 20:
    print("Icosagono")
else:
    print("Este Poligono nao existe")
