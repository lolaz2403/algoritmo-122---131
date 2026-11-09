import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite verbo: ")
    val verbo = scanner.nextLine()

    val ultimaLetra = verbo.last()
    if (ultimaLetra == 'R' || ultimaLetra == 'r') {
        val penultimaLetra = verbo[verbo.length - 2]
        when (penultimaLetra.uppercaseChar()) {
            'A' -> println("\n1ª conjugacao")
            'E', 'O' -> println("\n2ª conjugacao")
            'I' -> println("\n3ª conjugacao")
            else -> println("\nnao existe verbo com terminacao ur")
        }
    } else {
        println("\nnao e um verbo no infinitivo")
    }
}