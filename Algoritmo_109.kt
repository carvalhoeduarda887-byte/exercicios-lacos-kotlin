fun main() {
    print("Digite o primeiro nome: ")
    val nome1 = readln()
    print("Digite o segundo nome: ")
    val nome2 = readln()

    if (nome1.compareTo(nome2, ignoreCase = true) < 0) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}
