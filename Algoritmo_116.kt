fun main() {
    print("Digite o primeiro número: ")
    val a = readln().toDouble()
    print("Digite o segundo número: ")
    val b = readln().toDouble()
    print("Digite o terceiro número: ")
    val c = readln().toDouble()

    if (a > b && a > c) {
        println("Maior: $a")
    } else if (b > c) {
        println("Maior: $b")
    } else {
        println("Maior: $c")
    }
}
