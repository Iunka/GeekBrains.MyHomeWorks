public class Lesson1 {
    public static void main(String[] args){
        System.out.println(taskOne(5, 8, 9, 6));
    }

    public static float taskOne(int a, int b, int c, int d){
        return a * (b + ((float) c / d));
    }
}
