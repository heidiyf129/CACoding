package interface_adapter.clear_users;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


//Complete me

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel viewModel;

    public ClearPresenter(ClearViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentClearResult(ClearOutputData outputData) {
        viewModel.setClearSuccess(outputData.isSuccess());
        // Update any other necessary fields in the viewModel
    }
}
