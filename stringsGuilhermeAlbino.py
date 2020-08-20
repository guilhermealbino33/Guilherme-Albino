frase = input ("Digite uma frase de 7 digitos ou mais, de tamanho impar:")

if (len (frase) < 7):
    print ("Sua frase deve conter 7 ou mais dígitos!")

if (len (frase) %2 ==0):
    print ("Sua frase deve conter um número IMPAR de dígitos!")
 
else:
     print ("Os três caracteres no meio da frase são: ", frase[3:6])