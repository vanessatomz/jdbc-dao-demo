package modelDao;

import model.Department;
import model.Seller;

import java.util.List;

public interface SellerDao {
    List<Seller> findByDepartment(Department department);
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}

