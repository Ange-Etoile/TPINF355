class Etudiant(name:String,age: Int,var note : Double) : Person(name,age) {
    //lorsqu'on ne redefinit pas les attributs dans la classe fille on ne met ni override dans la classe fille ni
    //ni open dans la classe mere
    constructor(name: String,note: Double) : this(name,0,note)

    override fun salutation() {
        super.salutation()
    }
}
fun main(){
    val etudiant = Etudiant("etoile",12.3)
    etudiant.salutation()
}