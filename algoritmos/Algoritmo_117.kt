fun main() {
    print("Digite o primeiro número: ")
    val a = readln().toDouble()
    print("Digite o segundo número: ")
    val b = readln().toDouble()
    print("Digite o terceiro número: ")
    val c = readln().toDouble()

    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c

    println("Maior: $maior")
}
