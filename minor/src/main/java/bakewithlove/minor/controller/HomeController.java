package bakewithlove.minor.controller;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;

import bakewithlove.minor.global.GlobalData;
// import bakewithlove.minor.model.Product;
import bakewithlove.minor.service.CategoryService;
import bakewithlove.minor.service.ProductService;


@Controller
public class HomeController 
{
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping({"/","/home"})
    public String home(Model model)
    {
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "index";
    }
    @GetMapping("/shop")
    public String shop(Model model)
    {
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String shopByCategory(Model model, @PathVariable int id)
    {
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable int id)
    {
        model.addAttribute("product", productService.getProductById(id).get());
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "viewProduct";
    }
    
    // @RequesMapping("/shop")
    // public String viewHomePage(Model model, @Param("keyword") String keyword) {
    //     List<Product> listProducts = productService.listAll(keyword);
    //     model.addAttribute("listProducts", listProducts);
    //     model.addAttribute("keyword", keyword);
         
    //     return "index";
    // }
        

}
