import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite 1 lado: ")
    val a = scanner.nextDouble()
    print("\ndigite 2 lado: ")
    val b = scanner.nextDouble()
    print("\ndigite 3 lado: ")
    val c = scanner.nextDouble()

    if (a < b + c && b < a + c && c < a + b) {
        println("\nPodem ser lados de um triangulo")
    } else {
        println("\nNao podem ser lados de um triangulo")
    }
}