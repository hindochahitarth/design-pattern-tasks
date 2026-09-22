package Day_5.statustask;

public class PendingStatusState implements StatusState{
    @Override
    public void approve(StatusContext statusContext) {
        statusContext.setStatusState(new ApprovedStatusState());
        System.out.println("Approved");

    }

    @Override
    public void reject(StatusContext statusContext) {
        statusContext.setStatusState(new RejectedStatusState());
        System.out.println("Rejected");
    }

    @Override
    public void resubmit(StatusContext statusContext) {
        System.out.println("Only rejected status can be resubmit");

    }
}
