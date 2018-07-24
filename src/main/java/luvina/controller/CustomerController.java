package luvina.controller;

import luvina.model.Customer;
import luvina.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/customer")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customerList";
    }
    
    
    
}
