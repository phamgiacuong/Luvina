package luvina.controller;

import luvina.model.Account;
import luvina.model.Customer;
import luvina.model.Order;
import luvina.repository.AccTransactionRepository;
import luvina.service.AccTransactionService;
import luvina.service.AccountService;
import luvina.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static luvina.service.Impl.CustomerServiceImpl.user;

@Controller
public class OrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AccTransactionRepository accTransactionRepository;

//    @Autowired
    private List<Order> orderList = new ArrayList<Order>();
    @GetMapping("/order")
    public String index(Model model) {
        //lay custid o da
        int cust_id = user.getCust_id();
        model.addAttribute("customer", customerService.findCust_ID(cust_id));
//        model.addAttribute("accTransaction", accTransactionRepository.findAmount(cust_id));
//        customer = customerService.findCust_ID(cust_id);
        orderList.clear();
        for (Account account : customerService.findCust_ID(cust_id).getListAccount()) {
            float amount = accTransactionRepository.findAmount(account.getAccountId());
//            System.out.println(amount);
            Order order = new Order(account.getProductCd(),account.getProduct().getName(),account.getProduct().getPrice(),amount);
            orderList.add(order);
        }
        model.addAttribute("order", orderList);
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
