import math
'''10. Aritmética. Escreva um programa Python que leia do usuário dois inteiros a e b. Seu
programa deve computar e exibir o seguinte:
• A soma de a e b
• A diferença quando b é subtraído de a
• O produto de a por b
• O quociente quando a é dividido por b
• O resto quando a é dividido por b
• O resultado de log  a = ?
                    10
                  b
• O resultado de a'''
print("-------------------------------------------------------")
a = int(input("Digite um numero inteiro:"))
b = int(input("Digite um numero inteiro:"))
print("-------------------------------------------------------")

soma = a + b
diferencaBA = b - a
produto = a * b
quociente = a / b
resto = a % b
log = math.log10(a)
potencia = math.pow(a,b)

print("A soma é de:", soma)
print("A diferenca é de:", diferencaBA)
print("O produto é de:", produto)
print("O quociente é de:", quociente)
print("O resto é de:", resto)
print("O log é de:", log)
print("A potencia é de:", potencia)