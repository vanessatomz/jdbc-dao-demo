package modelDao;

import db.DB;
import modelDaoImpl.DepartmentDaoJDBC;
import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao crateSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}

