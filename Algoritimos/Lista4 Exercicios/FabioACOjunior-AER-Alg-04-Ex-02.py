precoProduto1original = 4.95
descontoProduto1 = (precoProduto1original * 60)  / 100 
novoPrecoProduto1 = precoProduto1original - descontoProduto1

precoProduto2original = 9.95
descontoProduto2 = (precoProduto2original * 60) / 100
novoPrecoProduto2 = precoProduto2original - descontoProduto2

precoProduto3original = 14.95
descontoProduto3 = (precoProduto3original * 60) / 100
novoPrecoProduto3 = precoProduto3original - descontoProduto3

precoProduto4original = 19.95
descontoProduto4 = (precoProduto4original * 60) / 100
novoPrecoProduto4 = precoProduto4original - descontoProduto4

precoProduto5original = 24.95
descontoProduto5 = (precoProduto5original * 60) / 100
novoPrecoProduto5 = precoProduto5original - descontoProduto5

print("--------------------------------------------------------------------------------------")
continuarOperação = int(input("Escolha uma opção: 1(Mostrar Tabela) ou 2(Nao mostrar Tabela):"))
print("--------------------------------------------------------------------------------------")
while continuarOperação == 1:
    print("Preco Original    Preco Desconto    Novo Preco")
    print("    ",precoProduto1original,"           ",  descontoProduto1, "           ", novoPrecoProduto1)
    print("    ",precoProduto2original,"           ",  descontoProduto2, "           ", novoPrecoProduto2)
    print("    ",precoProduto3original,"          ",  descontoProduto3, "           ", novoPrecoProduto3)
    print("    ",precoProduto4original,"          ",  descontoProduto4, "          ", novoPrecoProduto4)
    print("    ",precoProduto5original,"          ",  descontoProduto5, "          ", novoPrecoProduto5)
    continuarOperação = int(input("Escolha uma opção: 1(Mostrar Tabela) ou 2(Nao mostrar Tabela):"))
print("--------------------------------------------------------------------------------------")
print("Finalizando operação")
print("Operação finalizada")