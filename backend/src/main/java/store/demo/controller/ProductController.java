package store.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import store.demo.entities.Products;
import store.demo.repositories.ProductRepository;

import java.util.List;

@Controller
@RequestMapping("/demostore")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @CrossOrigin
    @GetMapping("/main")
    @ResponseBody
    public String main(){
        List<Products> productList = productRepository.findAll();
        return productList.get(0).getName();
    }

}
