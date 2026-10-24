fun main() {
    print("Digite o primeiro número: ")
    val a = readln().toDouble()
    print("Digite o segundo número: ")
    val b = readln().toDouble()

    val quadradoDiferenca = (a - b) * (a - b)
    val diferencaQuadrados = a * a - b * b

    println("Quadrado da diferença: $quadradoDiferenca")
    println("Diferença dos quadrados: $diferencaQuadrados")
}
