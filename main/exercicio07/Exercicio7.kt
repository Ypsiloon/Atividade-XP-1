package exercicio07

class Voo(val assentosDisponiveis: IntArray) {

    // Função para reservar um assento
    fun reservarAssento(assento: Int): Boolean {
        return if (assento >= 0 && assento < assentosDisponiveis.size && assentosDisponiveis[assento] == 0) {
            assentosDisponiveis[assento] = 1  // Reservando o assento
            true  // Reserva bem-sucedida
        } else {
            false  // Assento indisponível ou inválido
        }
    }

    // Função para verificar se um assento está disponível
    fun assentoDisponivel(assento: Int): Boolean {
        return assentosDisponiveis.getOrNull(assento) == 0
    }
}


fun exe7() {
    println("Executando exercício 7")
    // Criando um voo com 10 assentos
    val voo = Voo(IntArray(10) { 0 })

    // Simulação de reserva
    println("Digite o número do assento que deseja verificar e reservar (0-9):")
    val assento = readLine()?.toIntOrNull() ?: -1

    if (voo.verificarDisponibilidade(assento)) {
        if (voo.reservarAssento(assento)) {
            println("Assento $assento reservado com sucesso!")
        } else {
            println("Falha ao reservar o assento $assento.")
        }
    } else {
        println("O assento $assento não está disponível.")
    }
}