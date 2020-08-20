carro = input ("Digite o nome do carro: ")
print ("Nome do carro: "+ carro)
combustivel = input ("Digite o combustível do carro: ")
print (carro, "é movido a "+ combustivel)
media = float (input("Km/l que o carro faz: "))
print ("Media do carro: ", media, "km/l.")
cidade = input ("Nome da cidade de destino: ")
distancia = float (input ("Digite a distância da cidade de destino: "))
print ("Cidade de destino: "+ cidade, "e fica a ", distancia, " km de distancia.")

print ("O carro consumirá" , distancia / media, "litros de ", combustivel)

