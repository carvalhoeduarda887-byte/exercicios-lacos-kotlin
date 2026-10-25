fun main() {
    print("Digite a hora atual: ")
    val hora = readln().toInt()
    print("Digite os minutos: ")
    val minuto = readln().toInt()

    val totalMinutos = hora * 60 + minuto
    println("Minutos passados desde o início do dia: $totalMinutos")
}
