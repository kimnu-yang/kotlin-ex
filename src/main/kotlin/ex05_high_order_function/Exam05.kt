package ex05_high_order_function

import java.util.function.Predicate

fun main(){

    var numberList = listOf<Int>(1,2,3,4,5)

    // 제네릭 타입에 들어온 형태가 일치할 경우 아래 코드를 수행 이외에는 false
    var predicate = Predicate<Int> { t -> t % 2 == 0 }

    // 리스트 하위의 filter를 사용시 함수를 직접 전달 받음
    numberList.filter { it % 2 == 0 }

    // stream 하위의 filter는 미리 선언된 함수를 받을 수 있음
    numberList.stream().filter(predicate)

    // {}를 통해 함수의 결과 값을 바로 변수에 할당할 수 있음
    val add = { x: Int, y: Int -> x+y }

    // fun으로 매개변수를 직접 지정해 출력하기도 함
    val _add = fun(x: Int, y: Int): Int{ return x+y }

    println(_add(3,4))
    println(add(2,3))

    // 매개변수로 메소드를 전달받아서 처리할 수도 있음
    lambda(4,5,_add)
}

fun lambda(x: Int, y: Int, method: (Int, Int) -> Int){
    println(method(x,y))
}