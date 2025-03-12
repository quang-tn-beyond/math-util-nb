package com.quangtn;

import com.quangtn.math.util.nb.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MathUtilNb {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg1RunsWell();
        testFactorialGivenRightArg2RunsWell();
        testFactorialGivenWrongArgMinus2ThrowException();
    }

    //Code Các test case để test hàm (thực hành TDD)
    //hàm này ứng với 1 test case, với n = 0 thì hà nnayf trả về Ngon
    //tên hàm mang í nghĩa test case luôn để giúp dân dev kiểm tra tính thiếu đủ của các test case
    //-> tránh nghịch lí thuốc trừ sâu

    public static void testFactorialGivenRightArg0RunsWell(){
        int n = 0; //cho n = 0
        long expectedReslut = 1;// hy vọng giá trị trả về = 1
        long actualValue = MathUtility.getFactorial(n);
        //so sánh giữa expected và actual
        System.out.println("Expected Value: " + expectedReslut + "Actual value: " + actualValue);
        System.out.println("Status: " + (expectedReslut == actualValue));
    }

    public static void testFactorialGivenRightArg1RunsWell(){
        int n = 1; //cho n = 1
        long expectedReslut = 1;// hy vọng giá trị trả về = 1
        long actualValue = MathUtility.getFactorial(n);
        //so sánh giữa expected và actual
        System.out.println("Expected Value: " + expectedReslut + "Actual value: " + actualValue);
        System.out.println("Status: " + (expectedReslut == actualValue));
    }

    public static void testFactorialGivenRightArg2RunsWell(){
        int n = 5; //cho n = 5
        long expectedReslut = 120;// hy vọng giá trị trả về = 120
        long actualValue = MathUtility.getFactorial(n);
        //so sánh giữa expected và actual
        System.out.println("Expected Value: " + expectedReslut + "Actual value: " + actualValue);
        System.out.println("Status: " + (expectedReslut == actualValue));
    }

    public static void testFactorialGivenWrongArgMinus2ThrowException(){
        MathUtility.getFactorial(-2);

    }
}