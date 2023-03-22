numMatricula = int(input("Digite o numero da matricula:"))
uniNumAluno = (numMatricula // 1) % 10
dezNumAluno = (numMatricula // 10) % 10
centNumAluno = (numMatricula // 100) % 10
uniMilSemestreIngresso = (numMatricula // 1000) % 10
dezMilAnoIngresso = str((numMatricula // 10000) % 10)
centMilAnoIngresso = str((numMatricula // 100000) % 10)

print("Ano de ingresso: ", centMilAnoIngresso + dezMilAnoIngresso)
print("Semestre de ingresso: ",uniMilSemestreIngresso)