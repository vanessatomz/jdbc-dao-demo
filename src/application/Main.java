package application;

import model.Department;
import model.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1,"Electronics");
        System.out.println(department);

        Seller seller = new Seller(1,"Bob","bob@gmai.com",
                                    new Date(),3000.0,department);
        System.out.println(seller);


    }
}