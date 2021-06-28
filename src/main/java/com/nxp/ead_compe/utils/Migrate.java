package com.nxp.ead_compe.utils;

import com.nxp.ead_compe.entity.Product;
import com.nxp.ead_compe.entity.Sale;
import com.nxp.ead_compe.repo.ProductRepository;
import com.nxp.ead_compe.repo.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Migrate {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    SaleRepository saleRepository;

    public void dataSeeding() {
        if (saleRepository.findAll().size() == 0) {
            List<Sale> saleList = new ArrayList<>();

            Product product1 = new Product();
            product1.setPrice(30000L);
            product1.setDescription("Rain Boots");
            product1.setProdName("Boots");
            product1.setDateOfManf(1624542086000L);

            Product product2 = new Product();
            product2.setPrice(99999999L);
            product2.setDescription("AK47");
            product2.setProdName("Gun");
            product2.setDateOfManf(1624714886000L);

            Product product3 = new Product();
            product3.setPrice(99993999L);
            product3.setDescription("AK47");
            product3.setProdName("Gun");
            product3.setDateOfManf(1624714886000L);

            Product product4 = new Product();
            product4.setPrice(99992999L);
            product4.setDescription("Food");
            product4.setProdName("Cake");
            product4.setDateOfManf(1624714886000L);

            Product product5 = new Product();
            product5.setPrice(1399999L);
            product5.setDescription("Iphone 12 pro max");
            product5.setProdName("Phone");
            product5.setDateOfManf(1624714886000L);

            Product product6 = new Product();
            product6.setPrice(92999999L);
            product6.setDescription("Game Disk");
            product6.setProdName("Disk");
            product6.setDateOfManf(1624714886000L);

            Product product7 = new Product();
            product7.setPrice(13249999L);
            product7.setDescription("Dynamite1");
            product7.setProdName("Dynamite");
            product7.setDateOfManf(1624714886000L);

            Product product8 = new Product();
            product8.setPrice(99923259L);
            product8.setDescription("C4");
            product8.setProdName("Boom");
            product8.setDateOfManf(1624714886000L);

            Product product9 = new Product();
            product9.setPrice(1222999L);
            product9.setDescription("AK33");
            product9.setProdName("Gun");
            product9.setDateOfManf(1624714886000L);

            Product product10 = new Product();
            product10.setPrice(3333999L);
            product10.setDescription("AK51");
            product10.setProdName("Gun");
            product10.setDateOfManf(1624714886000L);

            Sale sale1 = new Sale();
            sale1.setSalesmanId(1L);
            sale1.setSalesmanName("Phuc");
            sale1.setDOS(1622887686000L);
            sale1.setProduct(product1);

            Sale sale2 = new Sale();
            sale2.setSalesmanId(2L);
            sale2.setSalesmanName("Xuan Phuc");
            sale2.setDOS(1624369286000L);
            sale2.setProduct(product1);

            Sale sale3 = new Sale();
            sale3.setSalesmanId(3L);
            sale3.setSalesmanName("NXP");
            sale3.setDOS(1623505286000L);
            sale3.setProduct(product1);

            Sale sale4 = new Sale();
            sale4.setSalesmanId(4L);
            sale4.setSalesmanName("PhucNX");
            sale4.setDOS(1623678086000L);
            sale4.setProduct(product2);

            Sale sale5 = new Sale();
            sale5.setSalesmanId(5L);
            sale5.setSalesmanName("NXPhuc");
            sale5.setDOS(1624369286000L);
            sale5.setProduct(product2);

            saleList.add(sale1);
            saleList.add(sale2);
            saleList.add(sale3);
            saleList.add(sale4);
            saleList.add(sale5);

            saleRepository.saveAll(saleList);
        }
    }
}
