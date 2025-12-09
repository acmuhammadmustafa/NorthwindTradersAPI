package com.pluralsight.NorthwindTradersAPI.data;

import com.pluralsight.NorthwindTradersAPI.models.Category;

import java.sql.SQLException;
import java.util.List;

public interface CategoryDao {
    int add(Category category);
    List<Category> getAll() throws SQLException;
}
