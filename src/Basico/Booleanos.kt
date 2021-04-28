package Basico

class Booleanos {
    fun main() {
        //booleanos
        //imutaveis - valores fixos
        val t = true
        val f = false

        //operador and (E) convenção
        println(t.and(f))
        //operador and (E) forma comum
        println(t && f)

        //operador or (OU) convenção
        println(t.or(f))
        //operador or (OU) forma comum
        println(t || f)

    }
}