fun main(){
    val conjunto = mutableSetOf("Maçã", "Morango", "Abacaxi",  "Abacaxi")
    val lista = mutableListOf("Maçã", "Morango", "Abacaxi",  "Abacaxi")
    // println(lista[0])
    // println(conjunto.contains("Abacaxi"))
    // for(i in lista){
    //     println(i == "Abacaxi")
    // }
    val mapa = mutableMapOf("Segunda" to "Maçã", "Terça" to "Morango")
    println(mapa.get("Segunda"))
}