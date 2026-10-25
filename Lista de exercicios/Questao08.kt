fun main() {
    val pratos = listOf("Hambúrguer", "Pizza", "Sushi", "Lasanha")
    val itemEsgotado = "Pizza"

    for (item in pratos) {
        if (item == itemEsgotado) {
            continue
        }

        println("Item disponível: $item")
    }
}
