lado1 = float(input("Insira o tamnaho do lado 1 do triangulo:"))
lado2 = float(input("Insira o tamnaho do lado 2 do triangulo:"))
lado3 = float(input("Insira o tamnaho do lado 3 do triangulo:"))
if lado1 == lado2 and lado1 == lado3 and lado2 == lado3:
    print("Este triangulo é um trigulo equilatero")
elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
    print("Este triangulo é um triangulo isoceles")
elif lado1 != lado2 and lado1 != lado3 and lado2 != lado3:
    print("Este triangulo é um triangulo escaleno")