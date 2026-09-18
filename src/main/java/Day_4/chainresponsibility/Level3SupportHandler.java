package Day_4.chainresponsibility;

public class Level3SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.CRITICAL){
            System.out.println("Level 3 handled the request");
        }
        else if (nextHandler!=null){
            System.out.println("Request cant be handled");
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        //this.nextHandler=nextHandler;
    }
}

