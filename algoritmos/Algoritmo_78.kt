fun main() {
    print("Digite o número de lados do polígono: ")
    val n = readln().toInt()

    if (n >= 3) {
        val diagonais = n * (n - 3) / 2
        println("Número de diagonais: $diagonais")
    } else {
        println("Um polígono precisa ter pelo menos 3 lados.")
    }
}
