fun main() {
    try {
        print("Masukkan angka pertama: ")
        val nilai1 = readLine()!!.toDouble()
        print("Masukkan angka kedua: ")
        val nilai2 = readLine()!!.toDouble()
        print("Masukkan angka ketiga: ")
        val nilai3 = readLine()!!.toDouble()
        print("Masukkan aksi operasi - Tambah(a), Kurang(d), Perkalian(c), Pembagian (b): ")
        when (readLine()) {
            "a" -> { print("Hasil Tambah = ${nilai2+nilai3}") }
            "d" -> { print("Hasil Kurang = ${nilai3-nilai1}") }
            "c" -> { print("Hasil Kali = ${nilai2*nilai3}") }
            "b" -> { print("Hasil Bagi = ${nilai1/nilai3}") }
            else -> {
                print("Operasi yang dimasukkan tidak valid")
            } }
    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}