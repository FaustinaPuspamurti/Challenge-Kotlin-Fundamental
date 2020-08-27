import java.util.*
import kotlin.math.ceil
fun main(){

    //Scanner
    val inputUser = Scanner(System.`in`)

    //Identitas
    println("********************************")
    print("* Nama : ")
    val nama = inputUser.nextLine()

    print("* Kelas : ")
    val kelas = inputUser.nextLine()

    print("* No.Absen : ")
    val absen = inputUser.nextInt()

    println("********************************")

    //Class Bangun
    val balok = Balok()
    val bola = Bola()
    val kubus = Kubus()
    val tabung = Tabung()

    println("1. Volume Balok")
    println("2. Volume Bola")
    println("3. Volume Kubus")
    println("4. Volume Tabung")
    print("Silahkan pilih : ")
    when {
        inputUser.nextInt() == 1 -> {

            //Volume Balok
            print("Panjang Balok : ")
            balok.panjang = inputUser.nextFloat()
            print("Lebar Balok : ")
            balok.lebar = inputUser.nextFloat()
            print("Tinggi Balok : ")
            balok.tinggi = inputUser.nextFloat()
            println("Maka Volume Balok Tersebut Adalah : ")
            println("Diketahui : \n Panjang ${balok.panjang} \n Lebar ${balok.lebar} \n Tinggi ${balok.tinggi}")


            //Hasil Volume
            val vBalok = volumeBalok(balok.panjang!!, balok.lebar!!, balok.tinggi!!)
            val volumeBulatkan = ceil(vBalok)
            println("Jawab : Jadi volume balok adalah "
                    + String.format("%.2f", vBalok )
                    + "\n Dan volume balok setelah dibulatkan $volumeBulatkan")
            println("********************************")

        }
        inputUser.nextInt() == 2 -> {

            //Volume Bola
            print("Jari jari Bola : ")
            bola.jariJari = inputUser.nextFloat()
            println("Maka Volume Bola Tersebut Adalah : ")
            println("Diketahui : \n Jari-jari ${bola.jariJari}")

            //hasil volume
            val vBola = volumeBola(bola.jariJari!!)
            val volumeBulatkan = ceil(vBola)
            println("Jawab : \n Jadi volume bola adalah "
                    + String.format("%.2f", vBola )
                    + " volume bola setelah dibulatkan $volumeBulatkan")
            println("********************************")
        }
        inputUser.nextInt() == 3 -> {
            //Volume Kubus
            print ("Sisi : ")
            kubus.sisi = inputUser.nextFloat()
            println("Maka Volume Kubus Tersebut Adalah :")
            println("Diketahui : \n Jari-jari ${kubus.sisi}")

            //Hasil Volume
            val vKubus = volumeKubus(kubus.sisi!!)
            val volumeBulatkan = ceil(vKubus)
            println("Jawab : Jadi volume Kubus adalah "
                    + String.format("%.2f", vKubus)
                    + "\n Dan volume Kubus setelah dibulatkan $volumeBulatkan")
            println("********************************")
        }
        inputUser.nextInt() == 4 -> {

            //Volume Tabung
            print("Jari jari Tabung : ")
            tabung.jarijari = inputUser.nextFloat()
            print("Tinggi Tabung : ")
            tabung.tinggi = inputUser.nextFloat()
            println("Maka Volume Tabung Tersebut Adalah : ")
            println("Diketahui : \n Jari-jari ${tabung.jarijari} \n Tinggi ${tabung.tinggi}")

            //Hasil Volume
            val vTabung = volumeTabung(tabung.jarijari!!, tabung.tinggi!!)
            val volumeBulatkan = ceil(vTabung)
            println("Jawab : Jadi volume Tabung adalah "
                    + String.format("%.2f", vTabung)
                    + "\n Dan volume Tabung setelah dibulatkan $volumeBulatkan")
            println("********************************")

        }
    }

}
fun volumeBalok(p : Float, l : Float, t : Float) : Float{
    return (p * l * t )
}
fun volumeBola(r : Float) : Double {
    return (Math.PI * 4/3 * r * r * r)
}
fun volumeKubus(s : Float) : Float {
    return (s*s*s)
}
fun volumeTabung(r: Float , t : Float) : Double{
    return (Math.PI*r*r * t )
}
class Balok {

    var panjang : Float? = null
    var lebar : Float? = null
    var tinggi : Float? = null

}
class Bola {

    var jariJari : Float? = null

}
class Kubus{
    var sisi : Float? = null
}
class Tabung{
    var jarijari : Float? = null
    var tinggi : Float? = null
}