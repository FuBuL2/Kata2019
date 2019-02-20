
package com.cifpcarballeira.katas.FizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int num) {
        if(num%3==0 && num%5 ==0) return "FizzBuzz";
        if(num%5 == 0) return "Buzz";
        if(num%3 == 0) return "Fizz";
        else return Integer.toString(num);
    }

}
