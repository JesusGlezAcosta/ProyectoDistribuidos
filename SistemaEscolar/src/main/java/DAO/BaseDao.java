package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public abstract class BaseDao <T> {
    
    private static final String CADENA_CONECCION = "jdbc:mysql://localhost/progresoAcademico?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USUARIO = "admin";
    private static final String PASSWORD = "admin";
    
    protected Connection getConexion() throws SQLException{
        try{
            Connection conexion = DriverManager.getConnection(CADENA_CONECCION, USUARIO, PASSWORD);
        return conexion;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            throw ex;
        }       
    }
    
    public abstract void guardar(T entidad);
    public abstract ArrayList <T> consultar();
    public abstract T consultarPorId(Integer id);
    public abstract void actualizar(T entidad);
    public abstract void eliminar(Integer id);
    
}
