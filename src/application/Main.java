package application;

import model.Department;
import model.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

import java.util.ArrayList;
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

        System.out.println("\n===== TEST 3: Seller findAll =======");
        List<Seller> list1 = sellerDao.findAll();
        for(Seller ojb: list1){
            System.out.println(ojb);
            System.out.println();
        }

        System.out.println("\n===== TEST 4: Seller Insert =======");
        Department dep = new Department(1,"Computers");
        Seller newSeller = new Seller(null,"Greg","gref@gmail.com",new Date(),4000.0,dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===== TEST 5: Seller Update =======");
        Seller seller1 = sellerDao.findById(1);
        seller1.setName("Martha Waine");
        sellerDao.update(seller1);
        System.out.println("Update completed!");


    }
}


