package com.dev.myfinances.service;

import com.dev.myfinances.model.Bill;
import com.dev.myfinances.repository.BillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillService {

    private final BillRepository billRepository;

    public Bill insertBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Bill getBillById(Integer id) {
        return billRepository.getById(id);
    }

    public List<Bill> getListBill() {
        return billRepository.findAll();
    }

    public void deleteBill(Bill bill) {
        billRepository.delete(bill);
    }

    public Bill updateBill(Bill bill) {
        return billRepository.save(bill);
    }

}
