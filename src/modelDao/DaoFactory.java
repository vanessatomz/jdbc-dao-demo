package modelDao;

import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao crateSellerDao(){
        return new SellerDaoJDBC();
    }
}

