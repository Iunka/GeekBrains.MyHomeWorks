public class Task3 {
    public static void main(String[] args){
        System.out.println(positivOrNegative(-5));
    }
    public static String positivOrNegative(int x){
        String b = "Число положительное";
        if (x < 0){
            b = "Число негативное";
        }
        return b;
    }
}
