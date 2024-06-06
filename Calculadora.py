valor1=int(input("Insira o primeiro valor: "))
valor2=int(input("Insira o segundo valor: "))
op=input("Escolha a operacão:")

if(op == '+'):
    print(valor1 + valor2)

elif(op == '-'):
    result = valor1 - valor2
    print(result)
    
elif(op == '/'):
    print(valor1 / valor2)

elif(op == '*'):
    print(valor1 * valor2)

elif(op == '%' ):
    print((valor1 + valor2)/100)

else :
    print("Opcao invalida")

    