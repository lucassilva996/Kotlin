package Basico
//O When é semelhante ao switch/case onde é executada certa tarefa

class WhenStatement {
    fun main(){
        val greet = "Hello!"
        when(greet){
            "Hola!" -> print("Spanish!")
            "Hello!" -> print("English!")
            "Hallo!" -> print("German!")
            else -> print("Unsopported Language")
        }
    }
}