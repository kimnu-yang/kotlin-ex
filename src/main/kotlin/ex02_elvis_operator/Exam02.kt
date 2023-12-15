package ex02_elvis_operator

fun main(){

    val a:Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    callFunction() // 매개변수가 null 값이 아닌 빈 값일 경우 default 값을 출력
}


fun callFunction(i: Int? = 100){
    // ? null일지도 모르는 값에 사용
    // 변수? << 변수가 null이야?
    // 변수?. << 변수가 null이 아닐때
    // 변수?: << 변수가 null 일때

    // 삼항연산자 대체
    val temp = i?.let { it * 20 } ?: "null 값 입니다."
    println(temp)
}