package com.pluralsight.NorthwindTradersAPI.data;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class JdbcProductDao implements ProductDao{


    @Override
    public int add(Product product) {
        return 0;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getByID(int id) {
        return null;
    }

    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public Product update(int id, Product product){
        return null;
    }

    @Override
    public Product delete(int id){
        return null;
    }
}