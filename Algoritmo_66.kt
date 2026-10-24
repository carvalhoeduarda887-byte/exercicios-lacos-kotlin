fun main() {
    print("Digite o tempo da viagem em horas: ")
    val tempo = readln().toDouble()
    print("Digite a velocidade média em km/h: ")
    val velocidade = readln().toDouble()

    val distancia = tempo * velocidade
    val litros = distancia / 12

    println("Velocidade média: $velocidade km/h")
    println("Tempo da viagem: $tempo horas")
    println("Distância percorrida: $distancia km")
    println("Litros utilizados: $litros")
}
