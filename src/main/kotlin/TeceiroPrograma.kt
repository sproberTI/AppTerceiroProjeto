fun main() {

    var anoDeNascimento = 2011
    var anoAtual = 2022
    imprimirResultados(anoDeNascimento,anoAtual)

}

fun calcularAnosDeVida(anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento
    return anosDeVida
}

fun imprimirResultados(anoDeNascimento: Int, anoAtual: Int) {

    println("* Como Calcular quantos anos de vida a pessoa tem?")
    println("- Ano de Nascimento: $anoDeNascimento")
    println("- Ano Atual........: $anoAtual")
    println("- Resultado........: ${calcularAnosDeVida(anoDeNascimento, anoAtual)}")
    println("  Você tem ${calcularAnosDeVida(anoDeNascimento, anoAtual)} de vida.")

}