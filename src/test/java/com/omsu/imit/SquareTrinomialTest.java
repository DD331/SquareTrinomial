package com.omsu.imit;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTrinomialTest {
    @Test
    public void testSolveEquetion(){ // Сравнивает Решения уравнения с заданными коэффицентами из SquareTrinomial со значениями из массива заданными в этом тестовом файле
        SquareTrinomial a = new SquareTrinomial(1,-70,600);
        double[] res = new double[2];
        res[0]=60;
        res[1]=10;
        assertArrayEquals("Ошибка тестирования квадратного трёхчлена [1/3]",res,a.solveEquetion(),0.0001); // получается 2 корня 60 и 10
        a = new SquareTrinomial(3,-18,27);
        res = new double[1];
        res[0]=3;
        assertArrayEquals("Ошибка тестирования квадратного трёхчлена [2/3]",res,a.solveEquetion(),0.0001); // получается 1 корень 3
        a = new SquareTrinomial(1,2,3);
        res = new double[0];
        assertArrayEquals("Ошибка тестирования квадратного трёхчлена [3/3]",res,a.solveEquetion(),0.0001); // корней нет
    }
}