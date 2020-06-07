package tipe_operator_init

class Teks {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //Char
            val charA = 'A'
            // Escape Garing Terbalik
            val charGaring = '\\'

            //String
            val hello = "Hello"
            val escapeString = "Jum\'at"

            //String Literal
            val helloNewLine = "Hello World!\n"
            val helloPanjang = """
                for(c in foo){
                    print(c)
                }""".trimIndent()
            val helloPanjangTrim = """
    |Hei, Kami Belajar Informatika
    |Akan memberikan kamu artikel
    |yang bermanfaat.
    """.trimIndent()
            val helloTemplate = "$hello kami di sini"
        }
    }
}