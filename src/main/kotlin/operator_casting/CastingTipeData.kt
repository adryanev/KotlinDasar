package operator_casting

class CastingTipeData {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val a  = 3
            val b = a.toLong()

            println("$a adalah ${a.javaClass.kotlin.simpleName}")
            println("$b adalah ${b.javaClass.kotlin.simpleName}")
        }
    }

}