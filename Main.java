public class Main {

    public int sum(int x, int y){
        return x + y;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Main main = new Main();

        int a = 3;

        int b = 8;

        System.out.println(main.sum(a, b));
    }
}