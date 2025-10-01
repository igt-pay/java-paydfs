package com.igt.pay.dfsvc.api.pgapi.service;

public interface PGAPIService {

    String prepareTx();

    String completeTx();

    String getRemainingLimit();

}
