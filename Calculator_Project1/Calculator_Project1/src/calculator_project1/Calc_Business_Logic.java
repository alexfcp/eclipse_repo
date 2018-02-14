package calculator_project1;

/**
* Alex Romero
* 2/13/18
* Comp 585
* Project 1
* @author alex
*/


public class Calc_Business_Logic {

	//helpful mathematical functions
	static double add(double a, double b) {
        return a+b;          
	}

    static double subtract(double a, double b) {
        return a-b;          
    }

    static double multiply(double a, double b) {
        return a*b;          
    }

    static double divide(double a, double b) {
        return a/b;          
    }

    static double mod(double a, double b){
        return a%b;
    }
    
    static double pow(double a, double b){
        double ans = a;

        for (int x=2; x<=b; x++){
            ans*= a;
        }
        return ans;
    }
    
}
