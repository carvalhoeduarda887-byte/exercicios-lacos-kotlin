fun main() {
    print("Digite o valor do produto: ")
    val preco = readln().toDouble()

    val novoPreco = preco * 0.91
    println("Preço com desconto: $novoPreco")
}
