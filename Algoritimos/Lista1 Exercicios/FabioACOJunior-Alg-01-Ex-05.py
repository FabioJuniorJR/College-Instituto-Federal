ValorTotalGanho = 0
CreditoVasi_1Litro_OR_Menos = 0.10 #Centavos
CreditoVasi_mais_1Litro = 0.25 #Centavos
qtdeVasi1LitroMenos = float(input("Digite a quantidade de vasilhames de 1 Litro ou menos:"))
qtdeVasiMais1Litro = float(input("Digite a quantidade de vasilhames com mais de 1 Litro:"))

retornoValorTotalVasi_1LitroMenos = qtdeVasi1LitroMenos * CreditoVasi_1Litro_OR_Menos
retornoValorTotalVasi_Mais1Litro = qtdeVasiMais1Litro * CreditoVasi_mais_1Litro

ValorTotalGanho = retornoValorTotalVasi_1LitroMenos + retornoValorTotalVasi_Mais1Litro

print("O total de creditos ganhos com vasilhames de 1L ou mais foi de: R$", "%.2f" %retornoValorTotalVasi_1LitroMenos)
print("O total de creditos ganhos com vasilhames com mais de 1L foi de: R$", "%.2f" %retornoValorTotalVasi_Mais1Litro)
print("O valor total de ganhos com todos os vasilhames foi de: R$", "%.2f" %ValorTotalGanho)




