package ex07_data_class

// data 클래스로 지정시 Spring @Data 어노테이션을 사용하는 것과 동일하게
// toString, equals, hashcode 코드를 자동으로 생성해준다.
data class User(
    var name: String?=null,
    var age: Int?=null,
    var email: String?=null
) {
}