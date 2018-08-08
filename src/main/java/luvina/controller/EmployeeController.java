package luvina.controller;

import luvina.model.Employee;
import luvina.service.EmployeeService;
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
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String index(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employeeList";
    }

    @GetMapping("/employee/create")
    public String create(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeFormCreate";
    }

    @GetMapping("/employee/{emp_id}/edit")
    public String edit(@PathVariable Integer emp_id, Model model) {
        model.addAttribute("employee", employeeService.find_EmpID(emp_id));
        return "employeeForm";
    }

    @GetMapping("/employee/{emp_id}/delete")
    public String delete(@PathVariable Integer emp_id, RedirectAttributes redirect) {
        employeeService.deleteByEmpID(emp_id);
        redirect.addFlashAttribute("success", "Deleted employee successfully!");
        return "redirect:/employee";
    }

    @GetMapping("/employee/search")
    public String search(@RequestParam("searchs") String searchs, Model model) {
        if (searchs.equals("")) {
            return "redirect:/employee";
        }

        model.addAttribute("employees", employeeService.search(searchs));
        return "employeeList";
    }

    @PostMapping("/employee/save")
    public String save(Employee employee, BindingResult result, RedirectAttributes redirect) {

        if (result.hasErrors()) {
            System.out.println(result.getAllErrors().get(0));
            return "employeeForm";
        }
        employeeService.save(employee);

        redirect.addFlashAttribute("success", "Saved employee successfully!");
        return "redirect:/employee";
    }

    @PostMapping("/employee/create")
    public String create(@Valid Employee employee, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "employeeForm";
        }
        employeeService.save(employee);
        redirect.addFlashAttribute("success", "Saved employee successfully!");
        return "redirect:/employee";
    }
}
