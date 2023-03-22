from math import tan,pi
n = float(input("Digite um valor para n lados:"))
l = float(input("Digite um valor para l comprimento de um lado:"))
area = (n * l**2) / (4*tan(pi/n))
print("A area é de:", area)