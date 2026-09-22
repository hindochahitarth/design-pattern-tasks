package Day_5.statustask;

public class Main {
    public static void main(String[] args) {
        StatusContext statusContext=new StatusContext();
        statusContext.resubmit();
        statusContext.reject();
        statusContext.approve();
        statusContext.resubmit();
        statusContext.approve();
        statusContext.setStatusState(new EscalatedStatusState());
        statusContext.approve();
    }
}
//CODE SMELL; Missing Object Orientation , violation of Open Closed Principle
// when a new status like escalated is added, every single method must opened and edited to create new if else block


/*before/after note:-

transformed multiple if/else statement into objects that can encapsulate own behaviour
new version supports open/close principle

real world apps:- used for  order management as order can be placed,shipped,cancelled,pending
 */