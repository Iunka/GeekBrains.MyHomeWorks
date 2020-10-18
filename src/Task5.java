public class Task5 {
    public static void main(String [] args){
        System.out.println(LeapYear(300));
    }
    public static String LeapYear(int x){
        String year = "Этот год не является високосным!";
        if(x % 4 == 0 && (x % 100 != 0 || x % 400 == 0)){
            year = "Этот год является високосным!";
        }
        return year;
    }
}
