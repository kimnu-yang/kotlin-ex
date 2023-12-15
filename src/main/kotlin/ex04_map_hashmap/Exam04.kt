package ex04_map_hashmap

fun main(){

    // Map도 List와 마찬가지로 가변형으로 사용시 mutable을 포함한 함수를 사용해야 한다.
    val mutableMap = mutableMapOf<String, Any>(

        // 맵에 들어가는 데이터는 Pair라는 형태의 데이터로 등록되어야 한다.
        Pair("key","value"),

        // 아래와 같이 간단히 Pair형을 만들수도 있다.
        "key" to "value"
    )

    // put 함수를 통해 데이터를 추가할 수도 있지만 아래처럼 간단히 추가 할 수도 있다.
    mutableMap["key"] = "value"
    val value = mutableMap["Key"]

    // HashMap은 기본적으로 가변형으로 생성된다.
    val hashMap = hashMapOf<String,Any>()

    // 3개가 한쌍으로 동작하는 객체 Triple
    // first, second, third로 값 지정/조회가 가능
    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}