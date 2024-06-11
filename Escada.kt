fun main() {
    print("Digite a altura: ")
    val altura = readLine()
    escadinha(altura?.toInt() ?: 0)
}

    
fun escadinha(altura: Int){
    for (i in 0 until altura){
        val espacos = " ".repeat(altura - i)
        val degraus = "#".repeat(i)
        print("${espacos}${degraus}")
        println()
    }
}