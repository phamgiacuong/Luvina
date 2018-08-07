package luvina.controller;

import luvina.model.Business;
import luvina.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/business")
    public String individual(Model model) {
        model.addAttribute("individuals", businessService.findAll());
        return "individualList";
    }

    @GetMapping("/business/{cust_id}/edit")
    public String edit(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("business", businessService.findCust_ID(cust_id));
        return "businessForm";
    }

    @PostMapping("/business/save")
    public String save(@Valid Business business, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "businessForm";
        }
        Integer a = business.getCust_id();
        businessService.save(business);
        redirect.addFlashAttribute("success", "Saved business successfully!");
        return "redirect:/business/" +a+ "/edit";
    }
}

