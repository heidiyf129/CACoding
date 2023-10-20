package interface_adapter.clear_users;

//Complete me

public class ClearViewModel {
    private boolean clearSuccess;

    public ClearViewModel() {
        this.clearSuccess = false; // default value
    }

    public boolean isClearSuccess() {
        return clearSuccess;
    }

    public void setClearSuccess(boolean clearSuccess) {
        this.clearSuccess = clearSuccess;
    }
}
