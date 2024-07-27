package app.task.dataModels;

import app.task.dataModels.Branch;

import java.util.List;

public class DataResponse {
    private String repozytoryName;
    private String ownerLogin;
    private List<Branch> branches;

    public DataResponse(String repozytoryName, String ownerLogin, List<Branch> branches) {
        this.repozytoryName = repozytoryName;
        this.ownerLogin = ownerLogin;
        this.branches = branches;
    }

    public String getRepozytoryName() {
        return repozytoryName;
    }

    public void setRepozytoryName(String repozytoryName) {
        this.repozytoryName = repozytoryName;
    }

    public String getOwnerLogin() {
        return ownerLogin;
    }

    public void setOwnerLogin(String ownerLogin) {
        this.ownerLogin = ownerLogin;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
