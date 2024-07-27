package app.task.services;

import app.task.dataModels.Branch;
import app.task.dataModels.DataResponse;
import app.task.dataModels.Repository;
import app.task.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ApiService {
    private final RestTemplate restTemplate;


    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<DataResponse> getRepozitoryList(String name) {
        Repository[] data = restTemplate.getForObject("https://api.github.com/users/" + name + "/repos", Repository[].class);
        if (data == null) {
            throw new UserNotFoundException("User not ", 404);
        } else {
            return Arrays.stream(data)
                    .filter(repo -> !repo.isFork())
                    .map(repo -> {
                        List<Branch> branches = getBranch(repo.getName());
                        return new DataResponse(repo.getName(), repo.getOwner().getLogin(), branches);
                    })
                    .collect(Collectors.toList());
        }
    }

    private List<Branch> getBranch(String repoName) {
        Branch[] data = restTemplate.getForObject("https://api.github.com/repos/zotthy/" + repoName + "/branches", Branch[].class);
        if (data == null || data.length == 0) {
            System.out.println("branch is null or empty");
            return Collections.emptyList();
        } else {
            Branch firstBranch = data[0];
            return Collections.singletonList(new Branch(firstBranch.getNameBranch(), firstBranch.getCommit()));
        }
    }

}

