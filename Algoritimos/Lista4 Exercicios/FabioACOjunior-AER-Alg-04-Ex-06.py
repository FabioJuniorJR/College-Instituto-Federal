
palavra = input("Digite uma palavra binaria de 8 bits:")
if len(palavra) != 8:
    print("ERRO, a palavra deve conter 8 bits")
n = 0
for bit in palavra:
    if bit != "0" and bit != "1":
        print("Erro")
    if bit == "1":
        n += 1
if n % 2 == 0:
    paridade = 0
else:
    paridade = 1
print(palavra, paridade)
        