package com.nxp.ead_compe.controller;

import com.nxp.ead_compe.entity.Product;
import com.nxp.ead_compe.entity.Sale;
import com.nxp.ead_compe.repo.ProductRepository;
import com.nxp.ead_compe.repo.SaleRepository;
import com.nxp.ead_compe.utils.FuncUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/nxp/v1/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    SaleRepository saleRepository;

    @RequestMapping("/products")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        for (Product prod : products) {
            prod.setDate(FuncUtils.long2Date(prod.getDateOfManf()));
        }
        model.addAttribute("products", products);
        List<Sale> sales = saleRepository.findAll();
        for (Sale sale : sales) {
            sale.setDate(FuncUtils.long2Date(sale.getDOS()));
        }
        model.addAttribute("sales", sales);
        return "listProduct";
    }
}
