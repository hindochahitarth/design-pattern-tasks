package Day_5.statustask;

public class EscalatedStatusState implements StatusState{


    @Override
    public void approve(StatusContext statusContext) {
        statusContext.setStatusState(new ApprovedStatusState());
        System.out.println("Escalated request approved");

    }

    @Override
    public void reject(StatusContext statusContext) {
        statusContext.setStatusState(new RejectedStatusState());
        System.out.println("Escalated request rejected");

    }

    @Override
    public void resubmit(StatusContext statusContext) {
        System.out.println("Cannot submit an active escalated request");

    }
}
