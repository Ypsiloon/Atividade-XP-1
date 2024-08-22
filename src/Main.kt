// Importando os exercícios específicos
import exercicio01.exe1
import exercicio02.exe2
import exercicio03.exe3
import exercicio04.exe4
import exercicio05.exe5
import exercicio06.exe6
import exercicio07.exe7
import exercicio08.exe8

fun main() {
    while (true) {
        println("Escolha o exercício para executar (1 a 8) ou 0 para sair:")
        val input = readLine()?.toIntOrNull() ?: continue

        when (input) {
            1 -> exe1()
            2 -> exe2()
            3 -> exe3()
            4 -> exe4()
            5 -> exe5()
            6 -> exe6()
            7 -> exe7()
            8 -> exe8()
            0 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida, tente novamente.")
        }
    }
}
