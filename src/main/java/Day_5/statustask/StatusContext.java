package Day_5.statustask;

public class StatusContext {
    private StatusState statusState;

    public StatusContext(){
        this.statusState=new PendingStatusState();
    }
    public void setStatusState(StatusState statusState){
        this.statusState=statusState;
    }
    public void approve(){
        statusState.approve(this);
    }
    public void reject(){
        statusState.reject(this);
    }
    public void resubmit(){
        statusState.resubmit(this);
    }

}
