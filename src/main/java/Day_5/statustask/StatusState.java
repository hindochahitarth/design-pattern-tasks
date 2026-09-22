package Day_5.statustask;

public interface StatusState {
    void approve(StatusContext statusContext);
    void reject(StatusContext statusContext);
    void resubmit(StatusContext statusContext);

}
