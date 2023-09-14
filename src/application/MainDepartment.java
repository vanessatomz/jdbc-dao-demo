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

        



    }
}
