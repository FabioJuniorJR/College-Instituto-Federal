'''2. Unidades de tempo (novamente). Neste exercício você deve fazer o processo inverso do
exercício anterior. Desenvolva um programa Python que recebe do usuário uma quantidade de
tempo em segundos. Então o programa deve exibir a quantidade de tempo equivalente na
forma D:HH:MM:SS, onde D, HH, MM e SS representam dias, horas, minutos e segundos
respectivamente. Os valores de horas, minutos e segundos devem ser formatados todos com
dois dígitos, sendo obrigatória a inclusão do dígito 0 para valores menores que 10.'''
intervaloTempo = float(input("Digite um intevalo de tempo em segundos:"))
convSegMin = (intervaloTempo /60) 
convSegHora = (intervaloTempo /60) /60
convSegDias = (((intervaloTempo/60) /60) /60)
print("O intervalo de tempo de segundos para minutos é de:", convSegMin)
print("O intervalo de tempo de segundos para horas é de:", convSegHora)
print("O intervalo de tempo de segundos para dias é de:", convSegDias)
print("O total de tempo em dias, horas e minutos é de:", convSegDias,":", convSegHora,":",convSegMin)