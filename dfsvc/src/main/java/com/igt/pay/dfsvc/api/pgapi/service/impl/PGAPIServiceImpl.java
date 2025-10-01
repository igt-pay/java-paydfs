package com.igt.pay.dfsvc.api.pgapi.service.impl;

import com.igt.pay.dfsvc.api.pgapi.service.PGAPIService;
import org.springframework.stereotype.Service;

@Service
public class PGAPIServiceImpl implements PGAPIService {

    @Override
    public String prepareTx() {
        return "OK: prepareTx";
    }

    @Override
    public String completeTx() {
        return "OK: completeTx";
    }

    @Override
    public String getRemainingLimit() {
        return "OK: getRemainingLimit";
    }

}
