// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
enum class Plano { FREE, PRO, GLOBAL }

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: String) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        
        
        
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
     val user = Usuario("Rafael")
     val curso = ConteudoEducacional("Introdução ao Kotlin", 120)
	 val formacao = Formacao("Desenvolvimento Android", "Introdução ao Kotlin" )
     val nivel = Nivel.INTERMEDIARIO
    
     val mensageNivel = when(nivel){
         Nivel.BASICO -> "Esse Curso é nivel básico"
         Nivel.INTERMEDIARIO -> "Esse curso é nivel Intermediário"
         Nivel.AVANCADO -> "Esse curso é nivel Avançado"
     } 
    
     val plano = Plano.PRO
     val mensagePlano = when(plano){
         Plano.FREE -> "Seu plano é FREE"
         Plano.PRO -> "Seu plano é PRO"
         Plano.GLOBAL -> "Seu plano é GLOBAL"
     
     } 
     
    println("Olá $user")
     
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}