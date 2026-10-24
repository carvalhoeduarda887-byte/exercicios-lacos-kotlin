fun main() {
    print("Digite o nome completo: ")
    val nome = readln().trim()

    if (nome == "JOSÉ" || nome.startsWith("JOSÉ ")) {
        println(nome)
    }
}
