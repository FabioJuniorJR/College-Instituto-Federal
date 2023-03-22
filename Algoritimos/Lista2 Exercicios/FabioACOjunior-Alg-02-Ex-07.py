numInteiro = int(input("Digite um numero inteiro:"))
uni = (numInteiro // 1) % 10
dez = (numInteiro // 10) % 10
cent = (numInteiro // 100) % 10
print("A centena do numero é:{} ".format(cent))
print("A dezena do numero é:{} ".format(dez))
print("A unidade do numero é:{} ".format(uni))