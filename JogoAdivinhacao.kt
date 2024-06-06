import kotlin.random.Random

fun main() {
   AdivinharNumero()
 }

 fun AdivinharNumero(){
    val numero = Random.nextInt(1,101)
    //val nungerado = 
    
    println("Bem vindo ao jogo de adivinha")
    println("Tente adivinha um numero de 1 a 100. ")

    while (true){
        print("Digite seu palpite: ")
        var input = readLine() ?: "0" // Lê a entrada do usuário como uma string
        var numeroDigitado = input.toInt()
    //  val randomNumber = Random.nextInt(1, 101) 
        when {
            numeroDigitado < numero  -> print("O numero e maior que $numeroDigitado. tente novamente ")
            numeroDigitado > numero  -> print("O numero e menor que $numeroDigitado. tente novamente ")
            else -> {
                print("Parabéns! Voce adivinhou o número  $numero")
                break
            }
        }
    }
 }  

