//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    val int1 = 3
    val int2 = 6.8
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//        println("bonjour")
//    }
    when(int1){
        6 -> println("is 6")
        3 -> println("is 3")
        4 -> println("is 4")
    }
    // avec les ternaires

    val res = when(int2){
        5.0 -> 5.8
        8.0 -> 7.9
        else -> 7.6

    }
    for (i in 1..10 step 2){
        println("i = $i")
    }
    for ((index,value) in (1..10).withIndex()){
        println("$index : $value")
    }

}