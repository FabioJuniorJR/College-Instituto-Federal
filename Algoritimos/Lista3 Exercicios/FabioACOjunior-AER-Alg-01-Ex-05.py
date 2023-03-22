'''Nome do mês e número de dias. A quantidade de dias de um mes pode variar de 28 a 31
dias. Neste exercício você deve criar um programa Python que recebe do usuário o nome de
um mês (como uma string). Então seu programa deve exibir uma mensagem informando a
quantidade de dias daquele mês. Caso o mês seja fevereiro, sua mensagem pode informar
“28 ou 29 dias”.'''
nomeMes = str(input("Digite o nome do mes:")).upper()
if nomeMes == 'JANEIRO':
    print("O mês de Janeiro tem 31 dias")
elif nomeMes == 'FEVEREIRO':
    print("O mês de Fevereiro tem 28 dias")
elif nomeMes == 'MARÇO':
    print("O mês de Março tem 31 dias")
elif nomeMes == 'ABRIL':
    print("O mês de Abril tem 30 dias")
elif nomeMes == 'MAIO':
    print("O mês de Maio tem 31 dias")
elif nomeMes == 'JUNHO':
    print("O mês de Junho tem 30 dias")
elif nomeMes == 'JULHO':
    print("O mês de Julho tem 31 dias")
elif nomeMes == 'AGOSTO':
    print("O mês de Agosto tem 31 dias")
elif nomeMes == 'SETEMBRO':
    print("O mês de Setembro tem 30 dias")
elif nomeMes == 'OUTUBRO':
    print("O mês de Outubro tem 31 dias")
elif nomeMes == 'NOVEMBRO':
    print("O mês de Novembro tem 30 dias")
elif nomeMes == 'DEZEMBRO':
    print("O mês de Dezembro tem 31 dias")
else:
    print("Este mes nao existe")