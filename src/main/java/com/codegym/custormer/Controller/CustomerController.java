package com.codegym.custormer.Controller;

import com.codegym.custormer.models.Customer;
import com.codegym.custormer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers",customers);
        return "customer/list";
    }

}
