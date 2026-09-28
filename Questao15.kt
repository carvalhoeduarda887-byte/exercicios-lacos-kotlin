fun main() {
    val lotes = listOf(
        listOf(100.0, 50.0, 200.0),
        listOf(80.0, -20.0, 150.0),
        listOf(30.0, 40.0)
    )

    loopLotes@ for (lote in lotes) {
        for (valor in lote) {
            if (valor < 0.0) {
                println("Transação inválida encontrada (R$ $valor). Interrompendo todo o processamento!")
                break@loopLotes
            }

            println("Transação processada: R$ $valor")
        }
    }
}
