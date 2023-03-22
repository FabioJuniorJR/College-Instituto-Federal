from math import sqrt
l1 = float(input("Digite o valor do lado1:"))
l2 = float(input("Digite o valor do lado2:"))
l3 = float(input("Digite o valor do lado3:"))

l = (l1 + l2 + l3) /2
area = sqrt(l * (l-l1) * (l-l2) * (l-l3))
print("A area é de :", area)