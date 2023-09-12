package modelDao;

import db.DB;
import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao crateSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}

