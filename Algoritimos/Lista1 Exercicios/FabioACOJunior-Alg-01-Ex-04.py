larguraTerreno = float(input("Digite a largura do Terreno em emtros:"))
profundidadeTerreno = float(input("Digite a profundidade do terreno em metros:"))

areaTerrenoHectares = (larguraTerreno * profundidadeTerreno) / 10_000

print(f"A area do terreno em hectares é de: {areaTerrenoHectares}ha")