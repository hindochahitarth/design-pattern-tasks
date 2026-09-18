package Day_4.chainresponsibility;

public class Request {
    private Priority priority;

    public Request(Priority priority){
        this.priority=priority;
    }
    public Priority getPriority(){
        return priority;
    }
}
