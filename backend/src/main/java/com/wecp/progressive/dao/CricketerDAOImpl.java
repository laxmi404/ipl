package com.wecp.progressive.dao;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
 
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
 
import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Cricketer;
 
 
 
public class CricketerDAOImpl implements CricketerDAO {
 
    @Override
    public int addCricketer(Cricketer cricketer) {
 
        return -1;
       
    }
 
    @Override
    public Cricketer getCricketerById(int cricketerId) {
       return null;    
    }
 
    @Override
    public void updateCricketer(Cricketer cricketer) {
       
    }
 
    @Override
    public void deleteCricketer(int cricketerId) {
       
    }
 
    @Override
    public List<Cricketer> getAllCricketers() {
        return List.of();
    }
 
 
}
 
 
