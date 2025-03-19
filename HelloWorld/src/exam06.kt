fun main() {
//    var myCar1 : Car = Car()
//    myCar1.color = "빨강"
//    myCar1.speed = 0
//
//    var myCar2 : Car = Car()
//    myCar2.color = "파랑"
//    myCar2.speed = 0
//
//    var myCar3 : Car = Car()
//    myCar3.color = "초록"
//    myCar3.speed = 0

    var myCar1 : Car = Car("빨강", 0)

    myCar1.upSpeed(50)

    println("자동차1의 색상은 " + myCar1.color + "이며, 속도는 " + myCar1.speed + "km입니다.")
}