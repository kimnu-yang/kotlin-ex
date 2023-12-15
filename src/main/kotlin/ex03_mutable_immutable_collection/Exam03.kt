package ex03_mutable_immutable_collection

fun main() {

    // 변수: 가변 var , 불변 val
    // 집합: 가변 mutable , 불변 immutable

    // 일반적으로 코틀린은 불변 리스트로 생성됨(이후 add 불가능)
    val list = listOf<User>(
        User("1",20)
    )

    // 가변형 집합의 경우는 mutable이 붙은 함수를 사용해 지정해야 한다.
    val userList = mutableListOf<User>()
    userList.add(User("2",10))
    userList.add(User("3",10))
    userList.add(User("4",10))

    for(element in userList){
        println(element)
    }

    // 값만 이용해 반복할때는 아래와 같이 사용 가능하다
    userList.forEach { it-> println(it) }

    // 인덱스 값도 같이 이용하려면 아래와 같은 함수를 사용한다.
    // 리스트의 인덱스와 값을 받아서 출력한 예시
    userList.forEachIndexed { index, user ->
        println("index : $index user : $user")
    }

    // 리스트의 값을 받아 함수식으로 출력한 예시
    userList.forEachIndexed(fun (index, user){
        println("index : $index user : $user")
    })

    for((index, element) in userList.withIndex()){
        println("index : $index user : $element")
    }
}

class User(
    var name: String,
    var age: Int
)