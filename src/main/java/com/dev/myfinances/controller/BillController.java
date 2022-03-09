package com.dev.myfinances.controller;

import com.dev.myfinances.model.Bill;
import com.dev.myfinances.rest.BillRestService;
import com.dev.myfinances.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillController implements BillRestService {

    private final BillService billService;

    @Override
    public Bill insertBill(Bill bill) {
        return billService.insertBill(bill);
    }

    @Override
    public Bill getBillById(Integer id) {
        return billService.getBillById(id);
    }

    @Override
    public List<Bill> getListBill() {
        return billService.getListBill();
    }

    @Override
    public void deleteBill(Bill bill) {
        billService.deleteBill(bill);
    }

    @Override
    public Bill updateBill(Bill bill) {
        return billService.updateBill(bill);
    }
}
