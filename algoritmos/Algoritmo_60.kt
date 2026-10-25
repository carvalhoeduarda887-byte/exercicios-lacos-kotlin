fun main() {
    print("Digite o primeiro termo: ")
    val primeiro = readln().toDouble()
    print("Digite a razão: ")
    val razao = readln().toDouble()

    val decimo = primeiro + 9 * razao
    println("O décimo termo da PA é: $decimo")
}
