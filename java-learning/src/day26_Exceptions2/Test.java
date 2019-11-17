package day26_Exceptions2;


import practice.Test;

 class test {
    void method1() throws ArithmeticException {
        throw new ArithmeticException("Calculation error");
    }

    void method2() throws ArithmeticException {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        Test t = new Test();
        t.method3();
        System.out.println("Handled by TECHNO");
    }
}

////Options:
////1. Calculation error
////2. ArithmeticException
////3. Handled by TECHNO
////4. ArithmeticException Handled by TECHNO ==answer is 4
//

