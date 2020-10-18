public class Task2 {
    public static void main(String[] args){
        System.out.println(YesNo(8, 6));
    }

    public static boolean YesNo(int firstNumber, int secondNumber){
        boolean b = firstNumber + secondNumber > 10 && firstNumber + secondNumber < 20;
        return b;
    }


}
