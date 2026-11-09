import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite valor de X: ")
    val x = scanner.nextDouble()

    if (x == 5.0) {
        println("\nO numero é o 5")
    } else if (x == 200.0) {
        println("\nO numero é o 200")
    } else if (x == 400.0) {
        println("O numero é o 400")
    } else if (x in 500.0..1000.0) {
        println("\nIntervalo 500-1000")
    } else {
        println("\nFora do escopo")
    }
}