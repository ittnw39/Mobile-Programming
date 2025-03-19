open class Car {
    var color : String = "" // 컬러, 스피드 = 속성
    var speed : Int = 0

    //정적 구성 요소 추가
    companion object {
        var carCount: Int = 0
        const val MAXSPEED: Int = 200
        const val MINSPEED: Int = 0
        fun currentCarCount(): Int {
            return carCount
        }
    }

    //생성자 추가
    constructor(color: String, speed: Int){
        this.color = color
        this.speed = speed
        carCount++
    }

    //오버로딩 추가
    constructor(speed: Int){
        this.speed = speed
    }
    constructor(){

    }

    open fun upSpeed(value: Int){
        if(speed+value >= 200)
            speed = 200
        else
            speed = speed + value
    }
    fun downSpeed(value: Int){
        if(speed-value <= 0)
            speed = 0
        else
            speed = speed - value
    }
}