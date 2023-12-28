import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    println("Введите сумму вашего перевода")
    val amount = scan.nextInt()
    val minComission = 35.0
    var comission = (amount * 0.75)/100
    if(comission< minComission ){
        comission = minComission
    }
    println("Вы заплатите $comission рублей комиссии при переводе")
}