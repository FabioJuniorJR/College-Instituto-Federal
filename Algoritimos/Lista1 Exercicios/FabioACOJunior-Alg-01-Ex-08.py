PesoBugigangas = 0.075
PesoQuinquilharias = 0.112
qtdeBugigangas = float(input("Digite a quantidade de bugigangas:"))
qtdeQuinquilharias = float(input("Digite a quantidade de Quinquilharias:"))

PesoTotalBugigangas = PesoBugigangas * qtdeBugigangas
PesoTotalQuinquilharias = PesoQuinquilharias * qtdeQuinquilharias
PesoTotalAbsoluto = PesoTotalBugigangas + PesoTotalQuinquilharias

print("O peso total de Bugigangas é de:", "%.2f" %PesoTotalBugigangas, "gramas")
print("O peso total de Quinquilharias é de:", "%.2f" %PesoTotalQuinquilharias, "gramas")
print("O peso total absoluto é de:", "%.2f" %PesoTotalAbsoluto, "gramas")