fun main(){
 val age = 24
 val layers = 6
 printCakeCandles(age)
 printCakeTop(age)
 printCakeBottom(age,layers)
}
fun printCakeCandles(age:Int){
 print(" ")
 repeat(age){
    print(",")
  }
 println()
 print(" ")
 repeat(age){
   print("|")
 }
 println()
}
fun printCakeTop(age:Int){
 repeat(age){
    print("=")
  }
  println()
}
fun printCakeBottom(age:Int, layers:Int){
 repeat(layers){
   repeat(age+2){
     print("@")
    }
    println()
 }
}