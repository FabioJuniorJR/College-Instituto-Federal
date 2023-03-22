A4 = 440.00
B4 = 493.88
C4 = 261.63
D4 = 293.66
E4 = 329.63
F4 = 349.23
G4 = 392.00
nota = str(input("Digite o nome da nota(A4, B4, C4, D4, E4, F4, G4 ou others) em maiusculo:"))
if nota == 'A4' or 'B4' or 'C4' or 'D4' or 'E4' or 'F4' or 'G4':
    if nota == 'A4':
        print("A frequencia da nota", nota, " é de:", A4)
    elif nota == 'B4':
        print("A frequencia da nota", nota, " é de:", B4)
    elif nota == 'C4':
        print("A frequencia da nota", nota, " é de:", C4)
    elif nota == 'D4':
        print("A frequencia da nota", nota, " é de:", D4)
    elif nota == 'E4':
        print("A frequencia da nota", nota, " é de:", E4)
    elif nota == 'F4':
        print("A frequencia da nota", nota, " é de:", F4)
    elif nota == 'G4':
        print("A frequencia da nota", nota, " é de:", G4)
if nota != 'A4' or 'B4' or 'C4' or 'D4' or 'E4' or 'F4' or 'G4':
    nota = str(input("Digite novamente a nota desejada em maiusculo(exemplo: A):"))
    oitavaDesejada = int(input("Digite apenas a oitava desejada:"))
    if nota == 'A':
            A4 += A4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",A4)
    elif nota == 'B':
            B4 += B4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",B4)
    elif nota == 'C':
            C4 += C4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",C4)
    elif nota == 'D':
            D4 += D4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",D4)
    elif nota == 'E':
            E4 += E4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",E4)
    elif nota == 'F':
            F4 += F4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",F4)
    elif nota == 'G':
            G4 += G4 + 2**(4 - oitavaDesejada)
            print("A frequencia da nota", nota, oitavaDesejada, " é: ",G4)