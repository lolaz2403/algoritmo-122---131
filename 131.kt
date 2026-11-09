import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\nDigite nome: ")
    val nome = scanner.nextLine()

    val primeiraLetra = nome.first().uppercaseChar()

    if (primeiraLetra in 'A'..'K') {
        println("\n$nome sala: 101")
    } else if (primeiraLetra in 'L'..'N') {
        println("\n$nome sala: 102")
    } else if (primeiraLetra in 'O'..'Z') {
        println("\n$nome sala: 103")
    } else {
        println("\n NOME INVALIDO")
    }
}