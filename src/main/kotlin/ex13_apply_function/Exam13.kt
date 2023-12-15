package ex13_apply_function

import ex11_let_function.UserDto

fun main() {

    // apply, 생성자 패턴
    // 수신받은 객체의 이름을 변경할수 없고 그 자신이 되어 this 또는 바로 내부 변수에 접근이 가능하다.
    val userDto = UserDto().apply {
        name = "홍길동"
    }

    println(userDto)
}

fun UserDto.myUserDto(){
    println(this.name)
}