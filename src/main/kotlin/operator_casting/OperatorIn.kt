package operator_casting

class OperatorIn {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val bilangan = intArrayOf(1,15,-2,50)

            if( 15 in bilangan){
                println("15 ada di dalam bilangan")
            }
        }
    }
}