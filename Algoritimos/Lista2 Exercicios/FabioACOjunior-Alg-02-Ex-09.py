numInteiro = int(input("Digite a data com DDMMAA:"))
uni = (numInteiro // 1) % 10
dez = (numInteiro // 10) % 10
cent = (numInteiro // 100) % 10
uniMil = (numInteiro // 1000) % 10
dezMil = (numInteiro // 10000) % 10
centMil = (numInteiro // 100000) % 10

print("A ordem inversa da data inserida é de:", dez, uni, uniMil, cent, centMil, dezMil )

