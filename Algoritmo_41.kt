fun main() {
    print("Digite o primeiro número: ")
    val a = readln().toDouble()
    print("Digite o segundo número: ")
    val b = readln().toDouble()
    print("Digite o terceiro número: ")
    val c = readln().toDouble()
    print("Digite o quarto número: ")
    val d = readln().toDouble()

    val media = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("Média ponderada: $media")
}
