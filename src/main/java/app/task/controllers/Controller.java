package app.task.controllers;

import app.task.dataModels.DataResponse;
import app.task.services.ApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final ApiService apiService;

    public Controller(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/repository/")
    public ResponseEntity<?> getData(@RequestParam String name) {
        List<DataResponse> dataResponses = apiService.getRepozitoryList(name);
        return ResponseEntity.ok(dataResponses);
    }

}
