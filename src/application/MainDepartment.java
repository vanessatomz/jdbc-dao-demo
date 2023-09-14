package application;

import model.Department;
import modelDao.DaoFactory;
import modelDao.DepartmentDao;
import modelDaoImpl.DepartmentDaoJDBC;

public class MainDepartment {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        // Test insert
       /* Department department = new Department(null,"Music");
        departmentDao.insert(department);
        System.out.println("Inserted: " + department.getId());*/

        // Test update
        /* Department department = new Department(6,"Food");
        departmentDao.update(department);
        System.out.println("Update completed...");*/

        // test findById
       /* Department department = departmentDao.findById(6);
        System.out.println(department); */


    }
}
