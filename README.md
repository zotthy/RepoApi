## The application connects to the GitHub API to list all repositories of a given user, excluding forked repositories.
### For each repository, it provides the following details:
### 1.Repository Name -name of the repository.
### 2.Owner Login - username of the repository owner.
### 3.Branches Information - for each branch in the repository, the application retrieves:
#### 3.a. Branch Name: name of the branch.
#### 3.b. Last Commit SHA: The SHA identifier of the last commit in the branch.


# How to run
````
git clone https://github.com/zotthy/RepoApi.git
cd RepoApi.git
docker compose up -d
````
# Endpoint
```
localhost:8080/repository/?name=zotthy
```
## Correct respone
```
[
    {
        "repozytoryName": "Logistic-Page",
        "ownerLogin": "zotthy",
        "branches": [
            {
                "commit": {
                    "sha": "bf1b3b09aab03f17ce90d01b779cb9cad759ff62"
                },
                "nameBranch": "addCargo"
            }
        ]
    },
    {
        "repozytoryName": "LogisticApi",
        "ownerLogin": "zotthy",
        "branches": [
            {
                "commit": {
                    "sha": "f2df889280bacd6fac774f0619fb97e8c120a914"
                },
                "nameBranch": "auth"
            }
        ]
    }
]
```
## Incorrect respone
```
{
    "Status": 404,
    "Message": "User not found"
}
```


