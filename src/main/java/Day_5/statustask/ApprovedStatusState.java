package Day_5.statustask;

public class ApprovedStatusState implements StatusState{
    @Override
    public void approve(StatusContext statusContext) {
        System.out.println("Already approved .Can't approve again");

    }

    @Override
    public void reject(StatusContext statusContext) {
        System.out.println("Cannot reject an approved request");

    }

    @Override
    public void resubmit(StatusContext statusContext) {
        System.out.println("Only rejected status can be resubmit");

    }
}
