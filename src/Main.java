public class Main {
    public static void main(String[] args) {
        SimpleMath simpleMath = new SimpleMath();
        TrigMath trigMath = new TrigMath();
        System.out.println("sum = " + simpleMath.getsum(3.5, 2.8));
        System.out.println("circle square = " + trigMath.getCircleSquare(  3));
    }
}