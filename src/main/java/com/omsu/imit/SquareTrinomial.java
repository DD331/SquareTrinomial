package com.omsu.imit;

public class SquareTrinomial{
    private double[] array = new double[3];
    public SquareTrinomial(double a,double b, double c){
        if(a==0) throw new IllegalArgumentException("Некорректные данные!");
        array[0]=a;
        array[1]=b;
        array[2]=c;
    }
    public double[] solveEquetion(){
        double[] result;
        double temp = Math.pow(array[1],2)-4*array[0]*array[2];             // считаем дискриминант
        if(temp>0) {                                                   // если больше нуля, находим 2 корня
            result = new double[2];
            result[0] = (-array[1]+Math.sqrt(temp))/(2*array[0]);
            result[1] = (-array[1]-Math.sqrt(temp))/(2*array[0]);
        } else {                                                       // равно нулю, то считаем 1 корень
            if (temp == 0) {
                result = new double[1];
                result[0] = -array[1] / (2 * array[0]);
            } else {
                result = new double[0];
            }
        }
        return result;
    }
}