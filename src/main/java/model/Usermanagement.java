package model;

import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.User;

public interface Usermanagement {



int saveuser(source.User user) throws SQLException, ClassNotFoundException;

public source.User fetchuser(String email, String passwords) throws ClassNotFoundException, SQLException;

public  List<source.User> getalluser() throws ClassNotFoundException, SQLException;
}
