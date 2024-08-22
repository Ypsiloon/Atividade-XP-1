package exercicio08

class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo: Int) {

    // Função para repor o estoque
    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            println("Reposição de estoque para o produto: $nome")
            quantidade = nivelMaximo
            println("Estoque de $nome atualizado para $quantidade unidades.\n")
        }
    }

    // Função para verificar o estoque
    fun verificarEstoque() {
        println("Verificando estoque do produto: $nome")
        println("Quantidade atual: $quantidade unidades")
        if (quantidade < nivelMinimo) {
            println("Estoque abaixo do nível mínimo!")
            reporEstoque()
        } else {
            println("Estoque está suficiente.\n")
        }
    }
}

fun exe8() {
    println("Executando exercício 8")
    val produtos = mutableListOf<Produto>()

    // Cadastro de 5 produtos
    produtos.add(Produto("Arroz", 50, 20, 100))
    produtos.add(Produto("Feijão", 10, 15, 80))
    produtos.add(Produto("Açúcar", 5, 10, 60))
    produtos.add(Produto("Sal", 30, 25, 50))
    produtos.add(Produto("Café", 8, 10, 40))

    // Verificar o estoque de cada produto
    for (produto in produtos) {
        produto.verificarEstoque()
    }
}