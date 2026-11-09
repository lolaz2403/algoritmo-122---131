import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite 1 lado: ")
    val a = scanner.nextDouble()
    print("\ndigite 2 lado: ")
    val b = scanner.nextDouble()
    print("\ndigite 3 lado: ")
    val c = scanner.nextDouble()

    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val lados: Double

        if (a > b && a > c) {
            maior = a.pow(2.0)
            lados = b.pow(2.0) + c.pow(2.0)
        } else if (b > c) {
            maior = b.pow(2.0)
            lados = a.pow(2.0) + c.pow(2.0)
        } else {
            maior = c.pow(2.0)
            lados = a.pow(2.0) + b.pow(2.0)
        }

        if (maior == lados) {
            println("\nTriangulo Retangulo")
        } else if (maior > lados) {
            println("\nTriangulo Obtusangulo")
        } else {
            println("\nTriangulo Acutangulo")
        }
    } else {
        println("\nas medidas não formam um triangulo")
    }
}