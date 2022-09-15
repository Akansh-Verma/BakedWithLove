package bakewithlove.minor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bakewithlove.minor.model.Product;
import bakewithlove.minor.service.ProductService;



@Controller
public class ShopController
{
    @Autowired
    private ProductService productService;
    @RequestMapping(path={"/","/filter"})
    public String home(Product product, Model model,String keyword)
    {
        if(keyword!=null)
        {
            List<Product> list=productService.getByKeyword(keyword);
            model.addAttribute("list", list);
            model.addAttribute("keyword", keyword);
        }
        else
        {
            List<Product> list=productService.getAllProduct();
            model.addAttribute("list", list);
        }
        return "filter";
    }
}
