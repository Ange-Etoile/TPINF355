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
    var n = 6
    var i = 2
    var cpt = 0
    while (i<(n/2)){
        if(n%i == 0){
            cpt++
        }
        i++
    }
    if (cpt == 0){
        println("ce nombre est premier")
    }
    else{
        println("ce nombre n'est pas premier")
    }
    do {
        println("entrez un nombre")
     var  n = readLine()!!.toInt()
    }while (n < 10 || n > 20)
//    pour gerer les exception
    var nombre = try {
        println("entrez un nombre")
        readLine()?.toInt()
    }catch (e : Exception){
        null
    }
//    pour le calcul de la moyenne
    fun moyenne(numbers : List<Int>):Float{
        var moy : Float
        var somme : Int = 0
        for(number in numbers){
            somme += number
        }
        moy = if (numbers.size == 0) 0.toFloat() else (somme/numbers.size).toFloat()
        return  moy
    }
}