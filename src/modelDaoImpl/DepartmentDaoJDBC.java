package modelDaoImpl;

import db.DB;
import db.DbException;
import model.Department;
import modelDao.DepartmentDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

        PreparedStatement st = null;

        try {

            st = conn.prepareStatement(" INSERT INTO department (Name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1,obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();

                if(rs.next()){
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            }else {
                throw new DbException("Unexpected erro...");
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {

        PreparedStatement st = null;
        try {

            st = conn.prepareStatement("UPDATE department SET Name = ? WHERE id = ?");

            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());

            int rowsAffected = st.executeUpdate();
            if(rowsAffected == 0){
                throw new DbException("Unexpected erro...");
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {

            st = conn.prepareStatement("SELECT Id, Name FROM department WHERE Id = ?");

            st.setInt(1, id);

            rs = st.executeQuery();

            if(rs.next()){
                Department dp = new Department();

                dp.setId(rs.getInt("Id"));
                dp.setName(rs.getString("Name"));

                return dp;
            }
            return null;
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            List<Department> obj = new ArrayList<>();

            st = conn.prepareStatement("SELECT * FROM department");
            rs = st.executeQuery();

            while (rs.next()){
                Department dp = new Department();
                dp.setId(rs.getInt("Id"));
                dp.setName(rs.getString("Name"));

                obj.add(dp);
            }

            return obj;
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
