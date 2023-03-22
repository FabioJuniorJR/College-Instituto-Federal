from math import radians,sin,cos,acos
latitude1 = radians(float(input("Informe a latitude em graus:")))
longitude1 = radians(float(input("Informe a latitude em graus:")))
latitude2 = radians(float(input("Informe a latitude em graus:")))
longitude2 = radians(float(input("Informe a latitude em graus:")))
distancia = 6371.01 * acos(sin(latitude1) * sin(latitude2) + cos(latitude1)
 * cos(latitude2) * cos(longitude1 - longitude2))

print("A distancia entre dois pontos é de:", distancia)