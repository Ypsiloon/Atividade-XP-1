package exercicio06

fun exe6() {
    println("Executando exercício 6")

    val temperaturas = DoubleArray(30)

    for (i in temperaturas.indices){
        println("Digite a temperatura ${i+1}: ")
        temperaturas[i] = readln().toDouble()
    }

    val temperaturaMedia = temperaturas.average()

    val temperaturaMaxima = temperaturas.maxOrNull()
    val diaMaxima = temperaturas.indexOfFirst { it == temperaturaMaxima } + 1

    val temperaturaMinima = temperaturas.minOrNull()
    val diaMinima = temperaturas.indexOfFirst { it == temperaturaMinima } + 1

    println("Temperatura média do mês: $temperaturaMedia°C")
    println("Temperatura máxima: $temperaturaMaxima°C no dia $diaMaxima")
    println("Temperatura mínima: $temperaturaMinima°C no dia $diaMinima")

}