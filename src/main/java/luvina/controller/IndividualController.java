package luvina.controller;

import luvina.model.Individual;
import luvina.service.IndividualService;
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
public class IndividualController {

    @Autowired
    private IndividualService individualService;

    @GetMapping("/individual")
    public String individual(Model model) {
        model.addAttribute("individuals", individualService.findAll());
        return "individualList";
    }

    @GetMapping("/individual/{cust_id}/edit")
    public String edit(@PathVariable Integer cust_id, Model model) {
        model.addAttribute("individual", individualService.findCust_ID(cust_id));
        return "individualForm";
    }

    @PostMapping("/individual/save")
    public String save(@Valid Individual individual, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "individualForm";
        }

        Integer a = individual.getCust_id();
        individualService.save(individual);
        redirect.addFlashAttribute("success", "Saved individual successfully!");
        return "redirect:/individual/" +a+"/edit" ;
    }
}
