fun main(){
    val int:Int = 0
    when(int){
        4,3,2,1 -> println("in 4")
        5-> println("5")
    }
    val array : List<Int> = arrayListOf(0,8,6)
    for (index in array.indices){
        println("$index : $index")
    }
    // fonction lamda {num1 : Int, num2 : Int -> num1 + num2}
    val nom = {num1 : Int, num2 : Int -> num1 + num2}
    println("10 + 5 :${nom(10,5)}")
    // fonction qui prend en parametre une fonction
    fun calcul (num1:Int,num2:Int, f:(Int,Int)->Int):Int{
        return  f(num1,num2)
    }
    //calcul(1,2,{n:Int, m:Int ->n+m})
    //calcul(1,2,add)
//    fun add(n:Int,m:Int):Int{
//        return n+m;
//    }
    //les tableaux^^
}