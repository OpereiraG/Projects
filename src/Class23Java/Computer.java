package Class23Java;

public class Computer {

 public void TurnOn(){
     System.out.println("Device turn on");
 }

 public void LightsUp(){
     System.out.println("Screen lights up");
 }

 public void TurnOff(){
     System.out.println("Device turn off");
 }

 public void Gaming(){
     System.out.println("You play games on the computer");
 }


}
class Apple extends Computer{

    public void TurnOn (){
        System.out.println("Turn on fast");
    }
}
class Lenovo extends Computer{

    public void LightsUp(){
        System.out.println("Lenovo device don't turn on");
    }



}
class HP extends Computer{

    public void TurnOff(){
        System.out.println("Hp computer is slow when turning off ");
    }


}
class Dell extends Computer{
    public final void Gaming(){
        System.out.println("Dell computer is bad at playing games");
    }


}

