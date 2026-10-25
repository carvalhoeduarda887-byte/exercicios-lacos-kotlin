fun main() {
    print("Digite o nome completo: ")
    val nome = readln().trim()

    if (nome.equals("José", ignoreCase = true) ||
        nome.startsWith("José ", ignoreCase = true)) {
        println(nome)
    }
}
