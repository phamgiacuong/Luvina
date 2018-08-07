package luvina.controller;

import luvina.model.Officer;
import luvina.service.OfficerService;
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
public class OfficerController {
    @Autowired
    private OfficerService officerService;

    @GetMapping("/officer/{cust_id}/edit")
    public String edit(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("officer", officerService.findCust_ID(cust_id));
        return "officerForm";
    }

    @PostMapping("/officer/save")
    public String save(@Valid Officer officer, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "officerForm";
        }

        Integer a = officer.getCust_id();
        officerService.save(officer);
        redirect.addFlashAttribute("success", "Saved Officer successfully!");
        return "redirect:/officer/" +a+ "/edit";
    }
}

