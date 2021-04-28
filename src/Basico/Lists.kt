package Basico

class Lists {
    fun main() {
        //lista imutavel
        val iList = listOf(1, 2, 3)

        //lista mutavel
        val mList = mutableListOf(1, 2, 3)

        //adicionando um elemento
        mList.add(4)
        println(mList)
        mList.add( 1, 0)
        println(mList)

        //recuperando os elementos
        println(mList[3])

        //removendo elementos
        mList.remove(0)
        println(mList)

        //iterando sobre os elementos
        for (element in iList){
            print(element)
        }
    }
}