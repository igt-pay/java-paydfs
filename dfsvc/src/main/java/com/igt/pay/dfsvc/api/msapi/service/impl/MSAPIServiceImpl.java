package com.igt.pay.dfsvc.api.msapi.service.impl;

import com.igt.pay.dfsvc.api.msapi.service.MSAPIService;
import org.springframework.stereotype.Service;

@Service
public class MSAPIServiceImpl implements MSAPIService {

    @Override
    public String getSession() {
        return "OK: getSession";
    }

    public String getProfile() {
        return "OK: getProfile";
    }

    public String setLimit() {
        return "OK: setLimit";
    }

    public String getRecentTxs() {
        return "OK: getRecentTxs";
    }

}
