package com.example.camunda.acess;

//import com.example.workflow.creditRequired.repository.CreditRepository;
import org.springframework.stereotype.Service;

@Service
public class CreditServiceImpl implements CreditService {
    private CreditRepository creditRepository;

    public CreditServiceImpl(CreditRepository creditRepository){
        this.creditRepository = creditRepository;
    }

    @Override
    public Long create(Long money, String userName, String comment) {
        Credit credit = new Credit();
        credit.setMoney(money);
        credit.setUsername(userName);
        credit.setComment(comment);
        System.out.println(credit);
        return creditRepository.saveAndFlush(credit).getId();
    }

    @Override
    public void update(Long money, String approver, Boolean isApproved) {
//        Optional<Credit> byEntityId = creditRepository.findOneByEntityId(money);
//        System.out.println(approver);
//        System.out.println(isApproved);
//        if(byEntityId.isPresent()){
//            Credit credit = byEntityId.get();
//            credit.setApprover(approver);
//            credit.setApproved(isApproved);
//            creditRepository.save(credit);
//        } else {
//            System.out.println(byEntityId);
//        }
    }
}
