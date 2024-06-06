

fun main(){
    Saque()
}

fun Saque(){
    //TODO: função que permita sacar o valor desejado, se o saldo da conta for suficiente.
    
    var saldo = 1000.0
    
    var valorSaque = readLine()!!.toDouble() ?: 0.0
    println("Valor do saque: $valorSaque")

    if(valorSaque <= saldo){
     println("Saque de R$$valorSaque efetuado com sucesso!!")
     saldo -= valorSaque
    }
    else {
     println("Saldo insuficiente, saque nao realizado.")
    }
  
}

fun Transferencia(){
    //TODO: função que permita tranfesrir o valor desejado para algum individuo, se o saldo da conta for suficiente.
    


}


fun ConsultarSaldo(){
    //TODO: função que imprime o saldo disponível na conta.
}

