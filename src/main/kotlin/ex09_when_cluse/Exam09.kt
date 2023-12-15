package ex09_when_cluse

import java.lang.NullPointerException

fun main() {

    // break문을 사용하지 않고 해당하는 구문만을 수행함
    val result = when(""){
        "" -> {
            ""
        }
        "MASTER" -> {
            "master"
        }
        "ADMIN" -> {
            "admin"
        }
        "USER" -> {
            "user"
        }
        else -> {
            "default"
        }
    }

    // 타입에 관한 조건을 수행할때에는 해당 타입에서 활용 가능한 함수들을 조건절 내에서 이용할 수 있다.
    var any : Any = "";
    var exception = RuntimeException()
    when(exception){
        is NullPointerException -> {

        }
        is RuntimeException -> {

        }
    }

    var number = 10
    when(val n = number % 2){
        0 -> {
            println(n)
        }
        else -> {
            println(n)
        }
    }

    val r = when{
        number % 2 == 0 -> {
            100
        }
        else -> {
            200
        }
    }
    println(r)
}