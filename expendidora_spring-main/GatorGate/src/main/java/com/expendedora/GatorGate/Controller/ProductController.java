package com.expendedora.GatorGate.Controller;

import com.expendedora.GatorGate.Model.Product;
import com.expendedora.GatorGate.Model.ProductDTO;
import com.expendedora.GatorGate.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000") // Ajusta el origen según sea necesario

@RestController
@RequestMapping("/products")
public class ProductController {

    //mis metodos//

    @GetMapping("/summary")
    public List<ProductDTO> getAllProductSummaries() {
        List<Product> products = productService.getAllProducts();
        return products.stream()
                .map(product -> new ProductDTO(
                        product.getName(),
                        product.getImg(),
                        product.getDescription(),
                        product.getPrice()))
                .collect(Collectors.toList());
    }




    //fin mis metodos//

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String keyword) {
        return productService.searchProducts(keyword);
    }

    @GetMapping("/by-category")
    public List<Product> getProductsByCategory(@RequestParam String categoryName) {
        return productService.getProductsByCategory(categoryName);
    }



}

