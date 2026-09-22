package Day_5.statustask;

public class RejectedStatusState implements StatusState{

    @Override
    public void approve(StatusContext statusContext) {
        System.out.println("Cannot approve a rejected request");
    }

    @Override
    public void reject(StatusContext statusContext) {
        System.out.println("Already rejected");

    }

    @Override
    public void resubmit(StatusContext statusContext) {
            statusContext.setStatusState(new PendingStatusState());
        System.out.println("Resubmitted");
    }
}
