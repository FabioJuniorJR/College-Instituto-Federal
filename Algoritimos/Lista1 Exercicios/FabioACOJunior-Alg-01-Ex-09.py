'''Faça de conta que você acabou de abrir uma conta de investimento que
rende 12% de juros ao ano. Os juros que você ganha são pagos ao final do ano. Escreva um
programa que começa lendo do usuário o valor inicial depositado na conta. Em seguida, o
programa deve computar e exibir o saldo da conta de investimento após 1, 2 e 3 anos. Exiba
cada valor com exatamente 2 casas decimais.'''
valorJurosPorcentagem = 12
periodoAno = 3 
periodoMeses = 36
print("-------------------------------------------------------------------------------------")
valorDepositado = float(input("Digite um valor para deposito do investimento:"))
print("-------------------------------------------------------------------------------------")
print("                     Rendimento no 1ºAno                       ")
valorAcumuloJurosAnoUm = (valorDepositado * 12) / 100
valorTotalRendimentoAnoUm = valorDepositado + valorAcumuloJurosAnoUm
print("O rendimento do investimento no 1ºAno foi de:", "%.2f" %valorTotalRendimentoAnoUm)
print("-------------------------------------------------------------------------------------")
print("                     Rendimento no 2ºAno                       ")
valorAcumuloJurosAnoDois = (valorTotalRendimentoAnoUm * 12) / 100
valorTotalRendimentoAnoDois = valorTotalRendimentoAnoUm + valorAcumuloJurosAnoDois
print("O rendimento do investimento no 2ºAno foi de:", "%.2f" %valorTotalRendimentoAnoDois)
print("-------------------------------------------------------------------------------------")
print("                     Rendimento no 3ºAno                       ")
valorAcumuloJurosAnoTres = (valorTotalRendimentoAnoDois * 12) / 100
valorTotalRendimento = valorTotalRendimentoAnoDois + valorAcumuloJurosAnoTres
print("O rendimento do investimento no 3ºAno foi de:", "%.2f" %valorTotalRendimento)
print("-------------------------------------------------------------------------------------")
print("                      Rendimento Total                       ")
print("O valor do rendimento do investimento foi de:", "%.2f" %valorTotalRendimento)
print("-------------------------------------------------------------------------------------")



 
