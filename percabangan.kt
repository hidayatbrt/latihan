// if else     diketahui Variabel nilai UTS dan UAS

fun main() {
    println("masukan nilai UTS")
    val UTS: Int=readLine()!!.toInt()
    println("masukan nilai UAS")
    val UAS: Int=readLine()!!.toInt()
    val NA: Double =(0.4 * UTS) + (0.6 * UAS)
    println(NA)
    if (NA > 80){
        println("Selamat Anda Naik Semester")
    }
    else
        println("Anda Cuti")



    println("masukan pilihan angka 1-12")
    val angka: Int? = readLine()!!.toInt()


    when (angka) {
        3,4,5 -> print("It is summer season")
        6,7,9 -> print("It is rainy season")
        8,11 -> print("It is autumn season")
        10,12,1,2 -> print("It is winter season")
        else -> {
            print("invalid input!")
        }
}
}