package ex08_default_value

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    Exam08(Store())

    val dateTimeUtil = DateTimeUtil()
    println(dateTimeUtil.localDateTimeToString())
}

data class Store(
    var registerAt: LocalDateTime?= null
)

class Exam08 {
    constructor(store: Store) {
        // 함수에 null을 담아 요청했을때는 아래 구문을 수행해 now()값을 출력한다.
        val strLocalDateTime = toLocalDateTimeString(store.registerAt)
        println(strLocalDateTime)

        // null이 아닌 빈값으로 함수를 요청하였을때에는 미리 선언한 기본값이 출력된다.
        println(toLocalDateTimeString())
    }

    fun toLocalDateTimeString(
        // localDateTime이라는 변수는 LocalDateTime형태이거나 null 일수 있다. 하지만 null이 아닌 아무값도 없다면 2020-02-02 13:0:0으로 설정된다.
        localDateTime: LocalDateTime? = LocalDateTime.of(2020,2,2,13,0,0)
    ): String{
        val temp = localDateTime ?: LocalDateTime.now()
        return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil {

    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(
        localDateTime: LocalDateTime? = LocalDateTime.now(),
        pattern: String ?= KST_FORMAT
    ): String{
        val temp = pattern ?: KST_FORMAT
        return (localDateTime?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(temp))
    }
}