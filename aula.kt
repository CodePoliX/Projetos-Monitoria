fun main() {
    var numero = 3
    var numero2: Int = 2

    var resultado = when{
        numero > numero2 -> "numero maior"
        numero == numero2 -> "numero igual"
        else -> "numero menor"
    }

    for(i in 10 downTo 0){
        println(i)
    }

    imprimir(resultado)
}


fun imprimir(texto: String){
    println(texto)
}