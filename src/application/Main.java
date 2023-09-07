package application;

import model.Department;
import model.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1,"Electronics");

        Seller seller = new Seller(1,"Bob","bob@gmai.com",
                                    new Date(),3000.0,department);

        SellerDao sellerDao = DaoFactory.crateSellerDao();



    }
}