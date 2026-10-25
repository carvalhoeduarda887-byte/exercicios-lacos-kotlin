fun main() {
    print("Digite o primeiro número: ")
    var a = readln().toDouble()
    print("Digite o segundo número: ")
    var b = readln().toDouble()
    print("Digite o terceiro número: ")
    var c = readln().toDouble()

    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }

    println("Ordem decrescente: $c $b $a")
}
