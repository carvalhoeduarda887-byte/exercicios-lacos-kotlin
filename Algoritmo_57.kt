import kotlin.math.*

fun main() {
    print("Digite a primeira nota: ")
    val pr1 = readln().toDouble()
    print("Digite a segunda nota: ")
    val pr2 = readln().toDouble()

    val media = (pr1 + pr2) / 2
    println("Média truncada: ${floor(media)}")
    println("Média arredondada: ${round(media)}")
}
