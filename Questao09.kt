fun main() {
    val tarefas = listOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Comprar pão",
        "Limpar casa"
    )

    for (i in tarefas.indices) {
        println("Tarefa ${i + 1}: ${tarefas[i]}")
    }
}
