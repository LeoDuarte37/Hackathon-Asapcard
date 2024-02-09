package com.mewtow.cardProcessor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mewtow.cardProcessor.model.Installment;

public interface InstallmentRepository extends JpaRepository<Installment, Long> {

}
