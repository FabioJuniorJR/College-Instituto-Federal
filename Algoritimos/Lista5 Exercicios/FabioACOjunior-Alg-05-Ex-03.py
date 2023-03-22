'''Calculadora de envio e-commerce. Uma loja online fornece envio de seus itens pelo preço
de R$ 10,95 para o primeiro item e R$ 2,95 para cada um dos demais itens. Escreva uma
função que receba a quantidade de ítens de um pedido e retorne o valor total do envio de
acordo com essas regras. Inclua um programa principal que leia do usuário o número de itens
adquiridos e mostre o custo do envio'''
def calculaValorNumItens(numItens):
    if numItens == 1:
        valorTotal = 10.95
    elif numItens > 1:
        valorTotal = 10.95 + (numItens * 2.95)
    print("O valor total de envio é:", valorTotal)
    
numItens = int(input("Digite o numero de intens do pedido:"))
calculaValorNumItens(numItens)