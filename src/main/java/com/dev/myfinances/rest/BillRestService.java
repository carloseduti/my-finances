package com.dev.myfinances.rest;

import com.dev.myfinances.model.Bill;
import com.dev.myfinances.rest.constants.ApiRestConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = BillRestService.PATH)
@Api(value = "API REST for operation with Bills")
public interface BillRestService {

    String PATH_REST = "/bill";
    String PATH = ApiRestConstants.PATH_MAIN + PATH_REST;

    @PostMapping
    @ApiOperation(value = "role responsible for entering a bill.")
    Bill insertBill(@RequestBody Bill bill);

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "responsible role get a bill.")
    Bill getBillById(@PathVariable(value = "id") Integer id);

    @GetMapping(value = "/all/{uui}")
    @ApiOperation(value = "responsible role get a bill.")
    List<Bill> getListBill(@PathVariable(value = "uui") String id);

    @DeleteMapping
    @ApiOperation(value = "role responsible for delete a bill.")
    void deleteBill(@RequestBody Bill bill);

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "responsible role get a bill.")
    void deleteBillById(@PathVariable(value = "id") Integer id);

    @PutMapping
    @ApiOperation(value = "role responsible for update a bill.")
    Bill updateBill(@RequestBody Bill bill);

}
