package com.igt.pay.dfsvc.api.pgapi.controller;

import com.igt.pay.dfsvc.api.pgapi.service.PGAPIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Videti za CrossOrigin, mozda ne treba...
@CrossOrigin("*")
@RestController
@RequestMapping("/dfs/v1/pgapi/")
public class PGAPIController {

    private PGAPIService pgapiService;


    public PGAPIController(PGAPIService pgapiService) {
        this.pgapiService = pgapiService;
    }



    @PostMapping("/prepareTx")
    public ResponseEntity<String> prepareTx() {
        String response = pgapiService.prepareTx();
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @PostMapping("/completeTx")
    public ResponseEntity<String> completeTx() {
        String response = pgapiService.completeTx();
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("/getRemainingLimit")
    public ResponseEntity<String> getRemainingLimit() {
        String response = pgapiService.getRemainingLimit();
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

}
