package com.example.camunda.acess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateCreditDelegate implements JavaDelegate {
    private final CreditService creditService;

    @Autowired
    public CreateCreditDelegate(CreditService creditService){
        this.creditService = creditService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String username = (String) delegateExecution.getVariable(CreditVariableConstants.USERNAME);
        String comment = (String) delegateExecution.getVariable(CreditVariableConstants.COMMENT);
        Long money = (Long) delegateExecution.getVariable(CreditVariableConstants.MONEY);

        Long id = creditService.create(money, username, comment);

        delegateExecution.setVariable(CreditVariableConstants.ID, id);
    }
}
