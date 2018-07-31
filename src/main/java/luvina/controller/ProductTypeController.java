package luvina.controller;

import luvina.model.ProductType;
import luvina.service.ProductTypeService;
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
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/producttype")
    public String index(Model model) {
        model.addAttribute("producttypes", productTypeService.findAll());
        return "productTypeList";
    }

    @GetMapping("/producttype/create")
    public String create(Model model) {
        model.addAttribute("producttype", new ProductType());
        return "productTypeFormCreate";
    }

    @GetMapping("/producttype/{productTypeCd}/edit")
    public String edit(@PathVariable String productTypeCd, Model model) {
        model.addAttribute("producttype", productTypeService.findProductTypeCd(productTypeCd));
        return "productTypeFormEdit";
    }

    @PostMapping("/producttype/save")
    public String save(@Valid ProductType productType, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "productTypeFormEdit";
        }
        productTypeService.save(productType);
        redirect.addFlashAttribute("success", "Saved producttype successfully!");
        return "redirect:/producttype";
    }

    @GetMapping("/producttype/{productTypeCd}/delete")
    public String delete(@PathVariable String productTypeCd, RedirectAttributes redirect) {
        productTypeService.deleteByProductTypeCd(productTypeCd);
        redirect.addFlashAttribute("success", "Deleted producttype successfully!");
        return "redirect:/producttype";
    }

    @GetMapping("/producttype/search")
    public String search(@RequestParam("searchs") String searchs, Model model) {
        if (searchs.equals("")) {
            return "redirect:/producttype";
        }

        model.addAttribute("producttypes", productTypeService.search(searchs));
        return "productTypeList";
    }

}

