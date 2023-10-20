package interface_adapter.clear_users;

//Complete me

public class ClearState {
    private String message;
    private boolean clearSuccessful;

    public ClearState() {
        this.message = "";
        this.clearSuccessful = false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Is clearing operation successful?
    public boolean isClearSuccessful() {
        return clearSuccessful;
    }

    public void setClearSuccessful(boolean clearSuccessful) {
        this.clearSuccessful = clearSuccessful;
    }
}
