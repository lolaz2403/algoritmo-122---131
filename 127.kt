import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite nome: ")
    val nome = scanner.nextLine()
    print("\ndigite 1ª nota: ")
    val nota1 = scanner.nextDouble()
    print("\ndigite 2ª nota: ")
    val nota2 = scanner.nextDouble()

    val media = (nota1 + nota2) / 2

    if (media >= 7.0) {
        println("$nome $media AP")
    } else if (media < 3.0) {
        println("$nome $media RP")
    } else {
        println("$nome $media PF")
    }
}