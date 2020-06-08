package operator_casting

class OperatorPenugasan {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val angka = 20.0
            var angkaJumlah = angka
            var angkaKurang = angka
            var angkaKali = angka
            var angkaBagi = angka
            var angkaMod = angka

            // +=
            angkaJumlah += 5
            println("$angka += 5 hasilnya $angkaJumlah")

            // -=
            angkaKurang -= 5
            println("$angka -= 5 hasilnya $angkaKurang")

            // *=
            angkaKali *= 5
            println("$angka *= 5 hasilnya $angkaKali")

            // /=
            angkaBagi /= 5
            println("$angka /= 5 hasilnya $angkaBagi")

            // %=
            angkaMod %= 5
            println("$angka %= 5 hasilnya $angkaMod")
        }
    }
}