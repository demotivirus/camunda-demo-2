package com.example.camunda.acess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {
    //Optional<Credit> findOneByEntityId(Long money);
}
