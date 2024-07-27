package app.task.dataModels;

public class Branch {
    private String name;
    private Commit commit;

    public Branch(String name, Commit commit) {
        this.name = name;
        this.commit = commit;
    }

    public String getNameBranch() {
        return name;
    }


    public Commit getCommit() {
        return commit;
    }
}
