'''Valor das entradas. Um determinado zoológico estipula o valor da entrada baseado na idade
do visitante. Visitantes com até dois anos de idade não precisam pagar. Crianças entre 3 e 12
anos de idade pagam R$ 14.00. Idosos com 65 anos ou mais pagam R$ 18.00. Todos os
demais pagam R$ 23.00. 
Crie um programa que inicia lendo as idades, uma por uma, de um
grupo de pessoas. O usuário deve entrar uma linha em branco para indicar que não há mais
pessoas no grupo. Depois disso, seu programa deve exibir uma mensagem informando o
preço total de todas as entradas para o grupo. O valor deve ser exibido com duas casas
decimais.'''
idade_0_2 = 00.00
valorTotalIdade_0_2 = 0
numPessoas_0_2 = 0                                                                                                                                                            

idade_3_12 = 14.00
valorTotalIdade_3_12 = 0
numPessoas_3_12 = 0  

idade_65_mais = 18.00
valorTotalIdade_65_mais = 0
numPessoas65 = 0  

idadeOthers = 23.00
valorTotalIdadeOthers = 0
numPessoasOthers = 0  

condicaoSetPessoas = str(input("Iniciar/continuar o processedimento de ingresso(sim) ou (aperte espaco para sair):"))
while condicaoSetPessoas == 'sim':
    idade = int(input("Digite a idade:"))
    if idade > 0 and idade <= 2:
        valorTotalIdade_0_2 += idade_0_2
        numPessoas_0_2 += 1 
    elif idade > 3 and idade <= 12:
        valorTotalIdade_3_12 += idade_3_12
        numPessoas_3_12 += 1 
    elif idade >= 65:
        valorTotalIdade_65_mais += idade_65_mais
        numPessoas65 += 1 
    else:
        valorTotalIdadeOthers += idadeOthers
        numPessoasOthers += 1
    condicaoSetPessoas = str(input("Iniciar/continuar o processedimento de ingresso(sim) ou (aperte espaco para sair)")) 
valorTotalIngressos = valorTotalIdade_0_2 + valorTotalIdade_3_12 + valorTotalIdade_65_mais + valorTotalIdadeOthers
print("-----------------------------------------------------------------------------------------------------------------------")       
print("Nota Fiscal Ingresso")
print("-----------------------------------------------------------------------------------------------------------------------")
print("Numero de Ingresso(s) de idades entre 0 e 2 anos:", numPessoas_0_2,"  | Valor total pelo(s) ingressos R$",valorTotalIdade_0_2 )
print("Numero de Ingresso(s) de idades entre 3 e 12 anos:", numPessoas_3_12," | Valor total pelo(s) ingressos R$", valorTotalIdade_3_12)
print("Numero de Ingresso(s) de idades de 65 anos ou mais:", numPessoas65,"| Valor total pelo(s) ingressos R$", valorTotalIdade_65_mais)
print("Numero de Ingresso(s) de idades diferentes:", numPessoasOthers,"        | Valor total pelo(s) ingressos: R$", valorTotalIdadeOthers)
print("-----------------------------------------------------------------------------------------------------------------------")
print("Valor total a pagar: R$", valorTotalIngressos)
print("-----------------------------------------------------------------------------------------------------------------------")  