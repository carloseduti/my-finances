package com.dev.myfinances.repository;

import com.dev.myfinances.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {
    List<Bill> findBillByUuid(String uuid);
}
