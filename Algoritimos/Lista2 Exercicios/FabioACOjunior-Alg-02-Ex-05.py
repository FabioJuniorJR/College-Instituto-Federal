'''5. Calculando o troco. Considere o software que controla uma máquina automática de compras.
Uma tarefa que ele precisa realizar é determinar quanto troco fornecer ao comprador quando
este faz o pagamento em dinheiro. Escreva um programa Python que inicia lendo do usuario
uma quantidade de centavos como um número inteiro (portanto vamos considerar números de
0 a 99). Então o seu programa deve calcular e exibir quantidade e o valor de cada moeda para
compor este troco em centavos informado. O troco deve ser montado com a menor quantidade
possível de moedas. Assuma que a máquina possui moedas de 50, 25, 10, 5 e 1 centavos.'''
m50 = 50
m25 = 25
m10 = 10
m5 = 5
m1 = 1
qtdeCentavosTotal = int(input("Digite a quantidade de centavos do pagamento de 0 a 99 centavos:"))
qtde50cent = qtdeCentavosTotal // m50
qtdeCentavosTotal = qtdeCentavosTotal - (m50 * qtde50cent)

qtde25cent = qtdeCentavosTotal // m25
qtdeCentavosTotal = qtdeCentavosTotal - (m25 * qtde25cent)

qtde10cent = qtdeCentavosTotal // m10
qtdeCentavosTotal = qtdeCentavosTotal - (m10 * qtde10cent)

qtde5cent = qtdeCentavosTotal // m5
qtdeCentavosTotal = qtdeCentavosTotal - (m5 * qtde5cent)

qtde1cent = qtdeCentavosTotal // m1
qtdeCentavosTotal = qtdeCentavosTotal - (m1 * qtde1cent)
print("-----------------------------------")
print("As notas do troco em centavos é de:")
print(qtde50cent, " nota(s) de 50 Centavos")
print(qtde25cent, " nota(s) de 25 Centavos")
print(qtde10cent, " nota(s) de 10 Centavos")
print(qtde5cent, " nota(s) de 5 Centavos")
print(qtde1cent, " nota(s) de 1 Centavo")
'''qtde25cent = qtdeCentavos // m25
qtdeCentavos = qtde25cent - qtdeCentavos

qtde10cent = qtdeCentavos // m10
qtdeCentavos = qtde10cent - qtdeCentavos

qtde5cent = qtdeCentavos // m5
qtdeCentavos = qtde5cent - qtdeCentavos

qtde1cent = qtdeCentavos // m1
qtdeCentavos = qtde1cent - qtdeCentavos'''