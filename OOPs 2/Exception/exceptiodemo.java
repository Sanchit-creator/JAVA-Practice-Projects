package Exception;

public class exceptiodemo {
    public static int name(int a, int b)throws divideByZeroException {
        if (b == 0) {
            throw new divideByZeroException();
            
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            name(10, 0);
        } catch (divideByZeroException e) {
            // TODO Auto-generated catch block
            System.out.println("Divide by zero exception raised");
            // e.printStackTrace();
        }
        System.out.println("Main");
        
    }
}

// Arthmetic exception comes with eception in numerical
