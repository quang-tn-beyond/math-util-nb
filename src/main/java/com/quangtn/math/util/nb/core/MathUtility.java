package com.quangtn.math.util.nb.core;

public class MathUtility {
    //class này chứa bộ thư viện chứa các hàm tính toán giống class math trong JSK
    // thư viện chứa hàm mà ko cần lưu kết quả thì nên thiết kế static, ví dụ math.sqrt() Math.abs()

    //21! là tràn, 20! vừa đủ
    //code hàm đông thời kiểm thử, muốn kiểm thử phải có test case
    public static long getFactorial(int n){
        long result;
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n, N must > 0 and < 20");
        }
        if(n ==0 ){
            return 1;
        }
        // khỏi viết else cho code đẹp
        result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
    //Test case #1
    //Verify Getfactorial()
    // Steps/Procedure
    //      (1) Given N with 0
    //      (2) Call GetFactorial(N)
    // Expected result: Method will return 1


    //Test case #2
    //Verify Getfactorial()
    // Steps/Procedure
    //      (1) Given N with 5
    //      (2) Call GetFactorial(N)
    // Expected result: Method will return 120
}
