fun main() {
    print("Digite um nome: ")
    val nome = readln()

    if (nome.startsWith("A", ignoreCase = true)) {
        println(nome)
    }
}
