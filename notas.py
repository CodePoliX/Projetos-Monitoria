soma = 2 + 5
while True:
    notaNumero = int(input("Insira sua nota:"))
    if(notaNumero < 11):
        break
    print("Nota invalida, insira nota valida")

if(notaNumero > 10):
    print("Não é válido.")
elif( 10 >= notaNumero >=8):
     print("Nota A+")
elif(notaNumero <= 7):
    print("Nota A-")

elif(notaNumero <= 6):
    print("Nota B")

elif(notaNumero <= 3):
    print("Nota C")
else:
    print("Nota D")

