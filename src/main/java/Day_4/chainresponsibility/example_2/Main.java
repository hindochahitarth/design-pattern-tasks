package Day_4.chainresponsibility.example_2;

public class Main {
    public static void main(String[] args) {
        LogRouter router=new LogRouter();
        router.addLogger("warn");
        router.log(2,"level 2");
    }
}
