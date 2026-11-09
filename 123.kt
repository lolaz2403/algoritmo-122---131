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
        if (a == b && a == c) {
            println("\nTriangulo equilatero")
        } else if (a == b || a == c || b == c) {
            println("\nTriangulo isosceles")
        } else {
            println("\nTriangulo escaleno")
        }
    } else {
        println("\nAs medidas não formam um triangulo")
    }
}