public class Swap {
    public void swapwiththeird(int X, int Y){
        int Z = X;
        X = Y;
        Y = Z;
        System.out.printf("X is : %d%n Y is : %d%n", X, Y);
    }
    public void swapwithouttheird(int X, int Y){
        X = X + Y;
        Y = X - Y;
        X = X - Y;
        System.out.printf("X is : %d%n Y is : %d%n", X, Y);
    }
    public static void main(String[] args){
        int X = 15, Y = 5;
        System.out.printf("X is : %d%n Y is : %d%n", X, Y);
        
        Swap mySwap = new Swap();
        mySwap.swapwiththeird(X, Y);
        mySwap.swapwithouttheird(X, Y);
    }
}
