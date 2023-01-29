package Class15Java;

public class MPratice3 {


    /*
    Create a method that takes an array of int sum all the elements from the array and return the sum
     */



   int arraySum(int [] arr){

       int sum=0;
       for (int num:arr) {
           sum+=num;
       }
       return sum;
    }
}
