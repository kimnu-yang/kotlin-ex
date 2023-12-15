package ex14_run_function

import ex11_let_function.UserDto
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    // run, 지역 scope
    // apply처럼 객체 자체가 되어 매개변수에 바로 접근이 가능하고 let처럼 마지막 데이터를 출력한다.
    val userDto = UserDto("").run {
        name = "홍길동"
        ""
    }

    println("result $userDto")

    val x = 10

    val sum = run {
        val x = 2
        val y = 3
        x + y
    }

    println(sum)

    val now: LocalDateTime? = null

    val n = now?.let { it }?: LocalDateTime.now()

    // 주로 let에 이어서 run으로 많이 사용함
    val d = now?.let {
        val minusTime = it.minusHours(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    }?: run {
        val now = LocalDateTime.now()
        val minusTime = now.minusHours(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    }
}