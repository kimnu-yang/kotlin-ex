package ex11_let_function

import java.time.LocalDateTime

fun main() {
    // let
    val now = LocalDateTime.now()
    val localDateTime: LocalDateTime? = null

    // 특정한 개체를 전달받아 가장 마지막에 수행된 내용이 리턴됨. (return을 사용하지 않음)
    // null point를 방지하지 위해 사용
    val kst = localDateTime?.let { localDateTime ->
        println("let scope $localDateTime")
        "let scope"
    } ?: LocalDateTime.now()

    println("result $kst")

    UserDto(name = "홍길동").let {
        logic(it)
    }
}

fun logic(userDto: UserDto?): UserResponse? {

    return userDto?.let { userDto ->
        println("dto $userDto")

        UserEntity(
            name = userDto.name
        )
    }?.let {
        println("entity $it")

        UserResponse(
            userName = it.name
        )
    }
}

data class UserDto(
    var name: String?=null,
)

data class UserEntity(
    var name: String?=null,
)

data class UserResponse(
    var userName: String?=null,
)