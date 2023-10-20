package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

//Complete me
public class ClearController {
    private final ClearInputBoundary inputBoundary;

    // The constructor now accepts an ClearInputBoundary, which it assigns to the inputBoundary field.
    public ClearController(ClearInputBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    public String clearAllUsers() {
        return inputBoundary.clearAllUsers();
    }
}
