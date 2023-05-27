enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val matricula: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val aluno1 = Usuario("Max", "1111111")

    val conteudo1 = ConteudoEducacional("Implementando uma API Rest")
    val conteudo2 = ConteudoEducacional("Realizando Testes Unitários em uma API Rest")

    val conteudos: List<ConteudoEducacional> = listOf(conteudo1, conteudo2)

    val formacao = Formacao("Spring Boot Developer", Nivel.INTERMEDIARIO, conteudos)

    formacao.matricular(aluno1)
    println(formacao)
}
