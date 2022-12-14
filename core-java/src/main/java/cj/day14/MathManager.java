package cj.day14;

interface MathOperations {
    double apply(double a, double b);
}
class Add implements  MathOperations{
    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}
class Mul implements  MathOperations{
    @Override
    public double apply(double a, double b) {
        return a * b;
    }
}
class Calculator{
        public double perform(double[] arr,MathOperations operations){
                double res = arr[0];
                for(int i=1;i<arr.length;i++){
                    res = operations.apply(res,arr[i]);
                }
                return res;
        }
}
public class MathManager {
    public static void main(String[] args) {
        double[] arr = new double[]{3,4,5,6,7,8,9,2,1,10};
        Calculator calc = new Calculator();
        MathOperations obj = new Mul();
        double result = calc.perform(arr,obj);
        System.out.println("Result is "+result);
    }
}
