fun main() {
    try {
        print("Masukkan angka pertama: ")
        val angka1 = readLine()!!.toDouble()
        print("Masukkan angka kedua: ")
        val angka2 = readLine()!!.toDouble()

                println("Hasil Tambah= ${angka1+angka2}")

                println("Hasil Kurang= ${angka1-angka2}")

                println("Hasil Kali= ${angka1*angka2}")

                println("Hasil Bagi = ${angka1/angka2}")

    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}