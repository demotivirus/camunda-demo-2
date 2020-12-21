package com.example.camunda.acess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCreditDelegate implements JavaDelegate {
    private final CreditService creditService;

    @Autowired
    public UpdateCreditDelegate(CreditService creditService) {
        this.creditService = creditService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long money = (Long) delegateExecution.getVariable(CreditVariableConstants.MONEY);
        String approver = (String) delegateExecution.getVariable(CreditVariableConstants.APPROVER);
        Boolean isApproved = (Boolean) delegateExecution.getVariable(CreditVariableConstants.IS_APPROVED);

        creditService.update(money, approver, isApproved);
    }
}
