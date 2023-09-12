package application;

import model.Department;
import model.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.crateSellerDao();
        System.out.println("===== TEST 1: Seller findById =======");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

    }
}