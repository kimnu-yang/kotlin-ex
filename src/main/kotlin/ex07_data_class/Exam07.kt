package ex07_data_class

fun main() {

    var user = User()
    user.name = "홍길동"
    user.age = 10
    user.email = "gmail"

    // 클래스를 복사하지만 주어진 매개변수를 수정함(data class 일 경우에만 제공)
    val user2 = user.copy(name = "이순신")

    // named arguments
    // 객체를 생성할때 이름값을 넣어주면 매개변수의 순서를 지키지 않아도 됨
    // kotlin fill class plugin을 설치하면 객체의 존재하는 변수들을 자동 생성해준다.
    val user3 = User(
        age = 10,
        email = "gmail",
        name = "유관순"
    )

    println(user)
    println(user2)
}