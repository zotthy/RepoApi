package app.task.dataModels;

import app.task.dataModels.Branch;
import app.task.dataModels.Owner;

import java.util.List;

public class Repository {
    private String name;
    private Owner owner;
    private boolean fork;
    private List<Branch> branches;

    public Repository() {
    }

    public Repository(String name, Owner owner, boolean fork, List<Branch> branches) {
        this.name = name;
        this.owner = owner;
        this.fork = fork;
        this.branches = branches;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }
}
