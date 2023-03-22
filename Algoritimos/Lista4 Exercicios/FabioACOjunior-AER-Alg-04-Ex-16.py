import random
random.random()
totalSorteios = 0
for simulacao in range(10):
    sorteios = 0
    cara = 0 
    coroa = 0
    while cara < 3 and coroa < 3:
        result = random.randint(0,1)
        if result == 0:
            print("0", end=" ")
            cara = 0
            coroa += 1
        else:
            print("A", end=" ")
            cara += 1
            coroa = 0
        sorteios += 1
    totalSorteios += sorteios
    print("({:d} sorteios)".format(sorteios))
print("Na media, foram {:.1f} sorteios.".format(totalSorteios/10))