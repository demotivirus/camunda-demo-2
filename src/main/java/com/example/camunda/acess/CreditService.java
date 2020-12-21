package com.example.camunda.acess;

public interface CreditService {
    Long create(Long money, String userName, String comment);
    void update(Long money, String approver, Boolean isApproved);
}
