package use_case.clear_users;

//Complete me

public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface dataAccess;
    private final ClearOutputBoundary outputBoundary;

    public ClearInteractor(ClearUserDataAccessInterface dataAccess, ClearOutputBoundary outputBoundary) {
        this.dataAccess = dataAccess;
        this.outputBoundary = outputBoundary;
    }

    public String clearAllUsers() {
        String deletedUsers;
        try {
            deletedUsers = dataAccess.clearAllUserData();
            ClearOutputData outputData = new ClearOutputData(true, deletedUsers);
            outputBoundary.presentClearResult(outputData);
        } catch (Exception e) {
            // Handle exceptions, potentially creating a failed ClearOutputData
            ClearOutputData outputData = new ClearOutputData(false, "");
            outputBoundary.presentClearResult(outputData);
            deletedUsers = ""; // or some error message
        }
        return deletedUsers;
    }
}
