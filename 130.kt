import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite valor do produto: ")
    val valor = scanner.nextDouble()

    if (valor < 20.0) {
        println("\nValor de venda: ${valor * 1.45}")
    } else {
        println("\nValor de venda: ${valor * 1.30}")
    }
}