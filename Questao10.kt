fun main() {
    val meta = 500.0

    val depositos = listOf(
        100.0,
        150.0,
        200.0,
        100.0,
        50.0
    )

    var saldo = 0.0

    for (deposito in depositos) {
        saldo = saldo + deposito

        if (saldo >= meta) {
            println("Meta atingida! Saldo atual: R$ $saldo")
            break
        }
    }
}
