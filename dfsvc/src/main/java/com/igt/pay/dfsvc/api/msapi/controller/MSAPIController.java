package com.igt.pay.dfsvc.api.msapi.controller;

import com.igt.pay.dfsvc.api.msapi.service.MSAPIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Videti za CrossOrigin, mozda ne treba...
@CrossOrigin("*")
@RestController
@RequestMapping("/dfs/v1/msapi/")
public class MSAPIController {

    private MSAPIService msapiService;


    public MSAPIController(MSAPIService msapiService) {
        this.msapiService = msapiService;
    }


    @GetMapping("/getSession")
    public ResponseEntity<String> getSession() {
        String response = msapiService.getSession();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getProfile")
    public ResponseEntity<String> getProfile() {
        String response = msapiService.getProfile();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/setLimit")
    public ResponseEntity<String> setLimit() {
        String response = msapiService.setLimit();
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("/getRecentTxs")
    public ResponseEntity<String> getRecentTxs() {
        String response = msapiService.getRecentTxs();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
