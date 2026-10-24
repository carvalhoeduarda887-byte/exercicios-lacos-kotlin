fun main() {
    print("Digite um nome: ")
    val nome = readln()

    println("Nome completo: $nome")
    if (nome.isNotEmpty()) {
        println("Primeiro caractere: ${nome.first()}")
        println("Último caractere: ${nome.last()}")
        println("Do primeiro ao terceiro: ${nome.take(3)}")
        if (nome.length >= 4) println("Quarto caractere: ${nome[3]}")
        println("Todos menos o primeiro: ${nome.drop(1)}")
        println("Os dois últimos: ${nome.takeLast(2)}")
    }
}
