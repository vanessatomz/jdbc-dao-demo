package application;

import model.Department;
import model.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.crateSellerDao();
        System.out.println("===== TEST 1: Seller findById =======");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n===== TEST 2: Seller findByIdDepartment =======");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj: list){
            System.out.println(obj);
            System.out.println();
        }

    }
}