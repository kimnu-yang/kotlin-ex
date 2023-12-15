package ex01_variable_declaration

fun main() {

    // var = mutable(가변), val = immutable(불변)
    val name: String = "홍길동"
    var _name: String = "홍길동"
    val n = "홍길동"

    // 따옴표 사이에 $기호를 넣는 것 만으로 변수를 읽어올 수 있다.
    println("사용자의 이름은 : $name")

    // 변수를 추정해서 생성할 수도 지정해서 생성할 수도 있다.
    var i = 10
    var _i: Int = 10

    var d: Double = 20.0
    var _d: Double

    var f: Float = 10f

    var b: Boolean = true;
}