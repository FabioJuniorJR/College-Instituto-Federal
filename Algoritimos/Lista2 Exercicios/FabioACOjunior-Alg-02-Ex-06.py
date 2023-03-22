'''Soma dos dígitos de um inteiro. Desenvolva um programa que obtenha do usuário um
número inteiro de 4 dígitos e exiba a soma dos dígitos do número. Por exemplo, se o usuário
fornecer o número 3141, então seu programa deve exibir o número 9 (3 + 1 + 4 + 1).'''
numInteiro = int(input("Digite um nomeiro inteiro de 4 digitos:"))

'''quocienteDivisor = numInteiro // 10
somaResto = numInteiro % 10

soma = 0
novoQuocienteDivisor = int(quocienteDivisor // 10)
novoDivisor = int(quocienteDivisor % 10)
somaResto += int(novoQuocienteDivisor)

novoQuocienteDivisor = int(novoQuocienteDivisor // 10)
somaResto += int(novoDivisor)
novoDivisor = int(quocienteDivisor % 10)

print(somaResto)'''

resto = 0
restoAlternativo = 0
quocienteAnterior = 0
quociente = 0
soma = 0 

quociente = numInteiro // 10
quocienteAnterior = quociente
resto = numInteiro % 10
soma = resto

quociente = quociente // 10
resto = quocienteAnterior % 10
soma += resto
quocienteAnterior = quociente

quociente = quociente // 10
resto = quocienteAnterior % 10
soma = soma + quociente + resto

'''quociente = quociente // 10
resto = quociente % 10
soma += resto'''

print("A soma dos digitos do numero inteiro ",numInteiro ," é de: ", soma)
