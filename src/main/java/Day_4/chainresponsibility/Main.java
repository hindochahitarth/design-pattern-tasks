package Day_4.chainresponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1SupportHandler();
        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level3SupportHandler();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Request request1=new Request(Priority.BASIC);
        Request request2=new Request(Priority.INTERMEDIATE);
        Request request3=new Request(Priority.CRITICAL);

        level1.handleRequest(request1);
        level2.handleRequest(request2);
        level3.handleRequest(request3);


    }

}
