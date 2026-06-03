public class TypeCastingDemo {
    public static void main(String[] args) {

        double d = 25.89;
        int i = (int)d;

        int num = 50;
        double value = (double)num;

        System.out.println("Double Value: " + d);
        System.out.println("Converted to Int: " + i);

        System.out.println("Integer Value: " + num);
        System.out.println("Converted to Double: " + value);
    }
}