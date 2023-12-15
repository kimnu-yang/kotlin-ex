package ex06_class

fun main() {

    // 객체를 새로 만들때 new 키워드를 사용하지 않아도 됨
    val dog = Dog("해피")

    // getter setter 없이 propety에 접근이 가능함
    println(dog.age)

    dog.age = 20

    println(dog.age)

    dog.eat()
    dog.bark()
}

interface Bark{
    fun bark()
}

interface Temp{
    fun hi()
}

// 클래스를 생성하며 생성자 메소드를 선언함
abstract class Animal(
    private val name: String?=""
): Bark {
    // body
    fun eat(){
        println("$name 식사 시작합니다.")
    }
}

// extends와 implements를 구분하지 않고 : 으로 상속 받고 여러개를 상속 받을 경우에는 ,로 추가함
// 전달 받은 매개변수를 바로 부모에게 매개변수로 전달함
class Dog(
    private val name:String?=null
) : Animal(name), Temp {

    var age: Int? = 0

    override fun bark() {
        println("$name : 멍멍")
    }

    override fun hi() {
        TODO("Not yet implemented")
    }
}