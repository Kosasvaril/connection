package store.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> main(){
        List<Products> productList = productRepository.findAll();
        System.out.println("SEMMI");
        return ResponseEntity.ok(productList.toString());
    }

}
