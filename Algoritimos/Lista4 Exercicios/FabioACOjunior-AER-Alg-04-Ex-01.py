numeroNotas = 0
soma = 0
media = 0

digito = float(input("Digite um numero diferente de zero(0):"))
while digito == 0:
    print("Erro")
    print("O primeiro valor deve ser maior  que zero.")
    print("-----------------------------------------------")
    digito = float(input("Digite um numero diferente de zero(0):"))

numeroNotas += 1
soma += digito
digito = float(input("Digite um numero diferente de zero(0):"))
numeroNotas += 1

while digito > 0:
    soma += digito
    digito = float(input("Digite um numero diferente de zero(0):"))
    numeroNotas += 1
    if digito == 0:
        print("Encerrando programa...")
        print("Programa encerrado com exito")
        print("-----------------------------------------------")
        break
numeroNotas -= 1
media = soma/numeroNotas
print("Resultado da Média Aritimetica: ", media)
print("-----------------------------------------------")