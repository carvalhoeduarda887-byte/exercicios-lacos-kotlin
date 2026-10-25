fun main() {
    print("Digite o primeiro termo: ")
    val primeiro = readln().toDouble()
    print("Digite a razão: ")
    val razao = readln().toDouble()

    val quinto = primeiro * Math.pow(razao, 4.0)
    println("O quinto termo da PG é: $quinto")
}
