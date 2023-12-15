package ex04_map_hashmap

fun main(){
    // java Object == kotlin Any
    val map = mapOf<String, Any>(
        Pair("",""),
        "Key" to "value"
    )

    val mutableMap = mutableMapOf<String, Any>(
        "key" to "value"
    )

    mutableMap["key"] = "value"
    val value = mutableMap["Key"]

    val hashMap = hashMapOf<String,Any>()

    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}