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
class Person(val name:String, private val age : Int){
    constructor( name: String) : this(name, 0)
}