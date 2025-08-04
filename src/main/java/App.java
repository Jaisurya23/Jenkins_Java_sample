public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Java Project!");
        App app = new App();
        System.out.println("2 + 3 = " + app.add(2, 3));
    }

    public int add(int a, int b) {
        return a + b;
    }
}
