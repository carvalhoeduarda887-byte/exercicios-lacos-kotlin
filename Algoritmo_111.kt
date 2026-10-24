fun main() {
    print("Digite o primeiro número: ")
    val a = readln().toDouble()
    print("Digite o segundo número: ")
    val b = readln().toDouble()

    if (a > b) {
        println("Maior: $a")
    } else {
        println("Maior: $b")
    }
}
