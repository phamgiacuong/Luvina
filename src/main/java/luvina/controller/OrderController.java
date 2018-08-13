package luvina.controller;

import luvina.model.Account;
import luvina.model.Customer;
import luvina.service.AccTransactionService;
import luvina.service.AccountService;
import luvina.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

@Controller
public class OrderController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/order")
    public String index(Model model) {
        //lay custid o da
        int cust_id = 1;
        model.addAttribute("customer", customerService.findCust_ID(cust_id));
//        customer = customerService.findCust_ID(cust_id);
//        for (Account account : customer.getListAccount()) {
//            int i = account.getAccountId();
//            model.addAttribute("accTransaction", accTransactionService.findAccId(i));
//        }
        return "orderList";
    }

    @GetMapping("/order/searchid")
    public String searchid(@RequestParam("searchs") Integer searchs, Model model) {
        if (searchs.equals("")) {
            return "redirect:/orderList";
        }
            model.addAttribute("customer", customerService.findCust_ID(searchs));
            return "orderList";
    }
    @GetMapping("/order/searchname")
    public String searchname(@RequestParam("searchs") String searchs, Model model) {
        if (searchs.equals("")) {
            return "redirect:/orderList";
        }
            model.addAttribute("customer", customerService.findCust_Name(searchs));
            return "orderList";
    }
}
