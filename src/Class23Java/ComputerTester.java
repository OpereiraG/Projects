package Class23Java;

import Replits.Replit148;

import java.sql.Array;
import java.util.concurrent.Callable;

public class ComputerTester {


    public static void main(String[] args) {

        Computer [] Array = {new Apple(),new Lenovo(),new HP(), new Dell()};




        for (Computer run:Array) {

            run.Gaming();
            run.TurnOff();
            run.LightsUp();
            run.TurnOn();
            System.out.println();

        }



    }
}
