ValorPratoPrincipal = 15.60
ValorSuco = 2.00
ValorSobremesa = 2.00
ValorTotalRefeicao = ValorPratoPrincipal + ValorSobremesa + ValorSuco
ValorTaxaServico = (ValorTotalRefeicao * 10) /100
ValorTotalPagar = ValorTotalRefeicao + ValorTaxaServico

print("-------------------------------------------------------")
print("                      NOTA FISCAL                      ")
print("-------------------------------------------------------")
print("Valor do Prato: R$", "%.2f" %ValorPratoPrincipal)
print("Valor do Suco: R$", "%.2f" %ValorSuco)
print("Valor da Sobremesa: R$", "%.2f" %ValorSobremesa)
print("Valor da Refeição: R$", "%.2f" %ValorTotalRefeicao)
print("Valor da Taxa de Serviço: R$", "%.2f" %ValorTaxaServico)
print("-------------------------------------------------------")
print("Valor Total a Pagar: R$", "%.2f" %ValorTotalPagar)
print("-------------------------------------------------------")
