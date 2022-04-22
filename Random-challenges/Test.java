public class Test {
    private static String name = "Samuel";
    private static int age = 29;

    public static void main(String[] args) {
        System.out.println(Test.name);
        System.out.println(Test.age);
        autoCalled();
    }

    public static String autoCalled() {
        return "This prints without provocation";
    }

}


