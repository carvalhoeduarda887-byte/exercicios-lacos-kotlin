fun main() {
    print("Digite o salário mínimo: ")
    val salario = readln().toDouble()
    print("Digite a quantidade de quilowatts: ")
    val quantidade = readln().toDouble()

    val preco = salario / 700
    val valor = preco * quantidade
    val desconto = valor * 0.90

    println("Preço por quilowatt: $preco")
    println("Valor a pagar: $valor")
    println("Valor com desconto de 10%: $desconto")
}
