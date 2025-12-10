package com.pluralsight.NorthwindTradersAPI.data;

import com.pluralsight.NorthwindTradersAPI.models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    int add(Product product);
    List<Product> getAll() ;
    Product getByID(int ID);
    Product insert(Product product);
    Product update(int ID, Product product);
    Product delete(int ID);

}
