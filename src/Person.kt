//class Person {
//    public val name:String
//    private val age:Int
//    constructor(age:Int, name: String){
//        this.age = age
//        this.name = name
//
//    }
//     deuxieme methode
//
//}
open class Person( open val name:String, open protected val age : Int){
    constructor( name: String) : this(name, 0)
    constructor() : this("etoile")
    fun salutation(){
        println("$name vous dit bonjour")
    }

}
fun main(){
    var person = Person()
    person.salutation()
}