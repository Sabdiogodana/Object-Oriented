fun main(){
var toyota = Car("Toyota","Mark x","KDD 729K",90)
    toyota.start()
    println(toyota.make)
    println(toyota.speed)
    toyota.accelerate(50)
    println(toyota.speed)
    var audi =Car("Audi","A3","KBB 182Z",0)
    audi.start()
    println(audi.registration)
    println(audi.speed)
    toyota.hoot()
    audi.hoot()
    println(toyota.speed)
    toyota.deccelerate(40)

    audi.accelerate(70)
    println(audi.speed)
    audi.stop()
    println(audi.speed)

    var pupil =student("Jane",22)
    println(pupil.name)


}
class Car(var make:String,var model:String,var registration:String,var speed:Int){
    fun start(){
        println("choigo gio gio,vrooom")
    }
    fun accelerate(acceleration:Int):Int{
        speed +=acceleration
        return speed
    }
    fun hoot(){
        println("tttiihht")
    }
    fun deccelerate(decceleration:Int):Int{
        speed -=decceleration
        return speed
    }
    fun stop(){
        speed = 0

    }
}



data class student(var name:String,var age:Int)