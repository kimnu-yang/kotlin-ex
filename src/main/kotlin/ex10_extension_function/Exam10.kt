package ex10_extension_function

fun main() {

    val user = ExamUser(name = "abcd")
    exam10(user)
}

fun exam10(examUser: ExamUser?){

    // 미리 작성해놓은 확장함수를 사용하여 코드를 간결화
    if(examUser.isNotNull() && examUser?.name.isNotNullOrBlank()){
        println(examUser?.name)
    }

    // 해당 값이 null이 아닐때만 실행
    examUser?.let {
        if(it.name.isNotNullOrBlank()){
            println(it.name)
        }
    }
}

data class ExamUser(
    var name: String?=null
)

// 확장 함수
// 이미 존재하는 String 클래스에 내가 원하는 기능을 추가 할 수 있다.
fun String?.isNotNullOrBlank(): Boolean{
    return !this.isNullOrBlank()
}

fun Any?.isNotNull(): Boolean {
    return this != null
}