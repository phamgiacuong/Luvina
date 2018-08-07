package luvina.controller;

import luvina.model.Product;
import luvina.service.ProductService;
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
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/product")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "productList";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("productTypes",productTypeService.findAll());
        return "productForm";
    }

    @GetMapping("/product/{productCd}/edit")
    public String edit(@PathVariable String productCd, Model model) {
        model.addAttribute("product", productService.findProductCd(productCd));
        model.addAttribute("productTypes",productTypeService.findAll());
        return "productForm";
    }

    @PostMapping("/product/save")
    public String save(Product product, BindingResult result, RedirectAttributes redirect) {

        if (result.hasErrors()) {
            System.out.println(result.getAllErrors().get(0));
            return "productForm";
        }
        productService.save(product);

        redirect.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/product/{productCd}/delete")
    public String delete(@PathVariable String productCd, RedirectAttributes redirect) {
        productService.deleteByProductCd(productCd);
        redirect.addFlashAttribute("success", "Deleted product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/product/search")
    public String search(@RequestParam("searchs") String searchs, Model model) {
        if (searchs.equals("")) {
            return "redirect:/product";
        }

        model.addAttribute("products", productService.search(searchs));
        return "productList";
    }
}
