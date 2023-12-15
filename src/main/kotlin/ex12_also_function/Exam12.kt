package ex12_also_function

import ex11_let_function.UserDto

fun main() {
    // also는 넘어 온 객체를 그대로 리턴함(객체를 새로 만들어도 이전 객체를 리턴함)
    // let과의 차이는(let은 마지막 출력값을 리턴하지만, also는 전달받은 그대로 전달함)
    val userDto = UserDto(
        name = "홍길동"
    ).also {dto: UserDto ->
        println(dto)

        UserDto(
            "유관순"
        )
    }

    println("result $userDto")
}