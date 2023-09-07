package modelDao;

import model.Department;
import model.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
