package com.dev.myfinances.rest;

import com.dev.myfinances.model.Category;
import com.dev.myfinances.rest.constants.ApiRestConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = CategoryRestService.PATH)
@Api(value = "API REST for operation with Categories")
public interface CategoryRestService {

    String PATH_REST = "/category";
    String PATH = ApiRestConstants.PATH_MAIN + PATH_REST;

    @GetMapping(value = "/all")
    @ApiOperation(value = "responsible role get categories.")
    List<Category> getCategories();

}
