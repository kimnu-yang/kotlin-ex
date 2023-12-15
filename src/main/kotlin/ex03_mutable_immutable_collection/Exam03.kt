package ex03_mutable_immutable_collection

fun main() {

    // 가변 var , 불변 val
    // mutable , immutable

    val userList = mutableListOf<User>()
    userList.add(User("1",10))
    userList.add(User("2",10))
    userList.add(User("3",10))

    // 일반적으로 코틀린은 불변 리스트로 생성됨(이후 add 불가능)
    val list = listOf<User>(
        User("4",20)
    )

    for(element in userList){
        println(element)
    }

    userList.forEach { it-> println(it) }

    userList.forEachIndexed { index, user ->
        println("index : $index user : $user")
    }

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