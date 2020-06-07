package tipe_operator_init

class Logika {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val isKosong = false
            val isGenap: Boolean = true

            println(isKosong.javaClass.kotlin.simpleName) //Boolean
            println(isGenap.javaClass.kotlin.simpleName) // Boolean
        }
    }
}