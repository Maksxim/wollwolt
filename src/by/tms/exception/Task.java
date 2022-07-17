package by.tms.exception;

public class Task {

    public static void main(String[] args) throws CheckedException {
     try {
         String str = null;
         System.out.println(TaskUtil.generateNullPointerException(str));
     }catch (NullPointerException e1){
         e1.printStackTrace();
     }
     try {
         TaskUtil.generateArrayIndexOutOfBoundsException();
     }catch (ArrayIndexOutOfBoundsException e2){
         System.out.println("Out of bounds array");
     }
     try {
         TaskUtil.generateIllegalArgumentException();
     }catch (IllegalArgumentException e3){
         System.out.println("IllegalArgumentException");
     }

        try {
            int x = TaskUtil.genRandom(1, 3);
            if (x == 1) {
                TaskUtil.generateArrayIndexOutOfBoundsException();
            } else if (x == 2) {
                TaskUtil.generateIllegalArgumentException();
            } else {
                TaskUtil.generateArithmeticException();
            }
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("found ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e2){
            System.out.println("found IllegalArgumentException");
        }catch (ArithmeticException e3){
            System.out.println("found ArithmeticException");
        }
        try {
            int variable = TaskUtil.genRandom(1, 2);
            if (variable == 1) {
                TaskUtil.generateArithmeticException();
            }
        }catch (ArithmeticException e1){
            System.out.println("division by zero is impossible");
        }finally {
            System.out.println("cannot be divided by zero");
        }

     try {
         TaskUtil.generateArithmeticException();
     }catch (ArithmeticException e4){
         throw new CheckedException(e4.getMessage());
     }



    }
}
