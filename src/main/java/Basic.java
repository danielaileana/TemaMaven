import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic {
    int pointsFloating;

//    public Basic(int pointsFloating) {
//        this.pointsFloating = pointsFloating;
//    }

    public  int add(int...varInt){
        int sum=0;
        for(int i=0;i<varInt.length;i++){
            sum+=varInt[i];
        }
        return sum;
 }

 public  double add(double...varDouble){
        double sumDouble=0;
        for(int i=0;i<varDouble.length;i++){
            sumDouble+=varDouble[i];
        }
        return sumDouble;
 }

 public  long add(long...varLong){
        long sumLong=0;
        for(int i=0;i<varLong.length;i++){
            sumLong+=varLong[1];
        }
        return sumLong;
 }
    public  int substract(int...varInt){
        int dif=0;
        for(int i=0;i<varInt.length;i++){
            dif-=varInt[i];
        }
        return dif;
    }
    public double substract(double...varDouble){
        int difD=0;
        for(int i=0;i<varDouble.length;i++){
            difD-=varDouble[i];
        }
        return difD;
    }
    public  long substract(long...varLong){
        int difL=0;
        for(int i=0;i<varLong.length;i++){
            difL-=varLong[i];
        }
        return difL;
    }
    public  int multiply(int...varInt){
        int multiplyInt=1;
        for(int i=0;i<varInt.length;i++){
            multiplyInt*=varInt[i];
        }
        return multiplyInt;
    }

    public double multiply(double...varDouble){
        double multiplyDouble=1.0;
        for(int i=0;i<varDouble.length;i++){
            multiplyDouble=varDouble[i]*varDouble[i];
        }
        return multiplyDouble;
    }
    public  long multiply(long...varLong){
        long multiplyLong=1L;
        for(int i=0;i<varLong.length;i++){
            multiplyLong=varLong[i]*multiplyLong;
        }
        return multiplyLong;
    }
    public int divide(int...varInt){
        int divideInteger=1;
        for(int i=0;i<varInt.length;i++){
            divideInteger=divideInteger/varInt[i];
        }
        return divideInteger;
    }
    public  double divide(double...varDouble){
        double divideDouble=1;
        for(int i=0;i<varDouble.length;i++){
            divideDouble=divideDouble/varDouble[i];
        }
        return divideDouble;
    }
    public  long divide(long...varLong){
        long divideLong=1;
        for(int i=0;i<varLong.length;i++){
            if(varLong[i]!=0){
            divideLong=divideLong/varLong[i];}
            else
            {
                System.out.println("ArithmeticException");
            }
        }
        return divideLong;
    }






}
