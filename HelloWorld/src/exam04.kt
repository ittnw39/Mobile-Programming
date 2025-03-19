var myVar : Int = 100 //메인에 속하지 않음 - 전역 변수
fun main() {
    var myVar : Int = 0 //메인에만 있는 애임 - 지역변수
    println (myVar)

    var sum : Int = addFuction(10,20)
    println(sum)
}

fun addFuction(num1: Int, num2: Int) : Int {
    var hap : Int
    hap = num1 + num2 + myVar
    return hap
}