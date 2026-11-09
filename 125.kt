import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("\ndigite sua idade: ")
    val idade = scanner.nextInt()

    if (idade >= 65) {
        println("\nmaior de 65")
    } else if (idade >= 18) {
        println("\nmaior de idade")
    } else {
        println("\nmenor de idade")
    }
}