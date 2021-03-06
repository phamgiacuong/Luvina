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

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";
    }

    @GetMapping("/customer")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customerList";
    }

    @GetMapping("/customer/{cust_id}/delete")
    public String delete(@PathVariable Integer cust_id, RedirectAttributes redirect) {
        customerService.deleteByCust_id(cust_id);
        redirect.addFlashAttribute("success", "Deleted customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerFormCreate";
    }

    @GetMapping("/customer/search")
    public String search(@RequestParam("searchs") String searchs, Model model) {
        if (searchs.equals("")) {
            return "redirect:/customer";
        }

        model.addAttribute("customers", customerService.search(searchs));
        return "customerList";
    }

    @GetMapping("/customer/{cust_id}/edit")
    public String edit(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("customer", customerService.findCust_ID(cust_id));
        return "customerForm";
    }

    @PostMapping("/customer/create")
    public String create(@Valid Customer customer, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "customerForm";
        }
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }

    @PostMapping("/customer/save")
    public String save(@Valid Customer customer, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "customerForm";
        }
        customerService.saves(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }

    @PostMapping("/customer/saves")
    public String saves(@Valid Customer customer, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "customerForm";
        }
        customerService.saves(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/customer/{cust_id}/ind")
    public String ind(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("customers", customerService.findAll1(cust_id));
        return "individualList";
    }

    @GetMapping("/customer/{cust_id}/bus")
    public String bus(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("customers", customerService.findAll2(cust_id));
        return "businessList";
    }

    @GetMapping("/customer/{cust_id}/off")
    public String off(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("customers", customerService.findAll3(cust_id));
        return "officerList";
    }

    @PostMapping("/login")
    public String login(@RequestParam("user_name") String user_name, @RequestParam("password") String password, Model model) {
        boolean a;
        a = customerService.login(user_name, password);
        if (a)
            return "home";
        else {
            model.addAttribute("customer", new Customer());
            return "login";
        }

    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";

    }

}
