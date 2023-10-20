package use_case.clear_users;

//Complete me

public class ClearOutputData {
    private final boolean success;
    private final String deletedUsers; // Information about deleted users

    public ClearOutputData(boolean success, String deletedUsers) {
        this.success = success;
        this.deletedUsers = deletedUsers;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getDeletedUsers() {
        return deletedUsers;
    }
}