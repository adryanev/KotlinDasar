package tipe_operator_init

class FloatingPoint {
    companion object {
        @JvmStatic fun main(args: Array<String>){
            // float
            val bilFloat = 0.15F
            println(bilFloat.javaClass.kotlin.simpleName) //Float
            //Double
            val bilDouble = 0.16
            println(bilDouble.javaClass.kotlin.simpleName) // Double
        }
    }
}