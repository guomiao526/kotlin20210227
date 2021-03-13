package com.函式呼叫.繼承函式.DRY

//DRY (Don't Repeat Yourself)
//減少重複的程式碼

data class User(val id: Int, val name: String, val address: String)

//撰寫一個可以驗證 User 的繼承函式
fun User.validateBeforeSave() {
    //println("${id},${name},${addr}")
    //驗證
    fun valid(value: String, fieldName: String){
        if(value.isEmpty()){
            throw Exception("can't save user $id empty $fieldName")
        }
    }
    valid(name, "Name")
    valid(address,"Address")
}
fun saveUser(user: User) {
    println("Save $user")
}
fun main() {
    val user = User(1, "mary", "Taoyuan")
    //驗證是否每個欄位都有資料 ?
    user.validateBeforeSave()
    saveUser(user)
}