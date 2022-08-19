package com.diegomoreno.devjava.example3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diegomoreno.devjava.example3.dto.Departments;
import com.diegomoreno.devjava.example3.dto.Jobs;

public class BaseDatos {

    private Connection conn;

    public Connection getConnection(String url) throws SQLException {
        return getConnection(url, " ", "");
    }

    public Connection getConnection(String url, String username, String password) throws SQLException {
        if (conn == null) {
            // Pedir la conexión
            conn = DriverManager.getConnection(url, username, password);
        }
        return conn;
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public List<Departments> listarDepartamentos() throws SQLException {
        var resp = new ArrayList<Departments>();
        var statement = conn.createStatement();
        var rset = statement.executeQuery("SELECT * FROM departments");
        while (rset.next()) {
            var department = new Departments();
            department.setId(rset.getInt("department_id"));
            department.setName(rset.getString("department_name"));
            department.setLocation(rset.getInt("location_id"));
            resp.add(department);
        }
        return resp;
    }

    // puedo devolver esta excepción como los métodos anteriores o ejecutar un try
    // dentro de mi método
    // public boolean crearDepartamento(Departments department) throws SQLException,
    // FileNotFoundException, ArithmeticException
    // si se crea hija de Excepción hay que colocar el throws siempre
    public boolean crearDepartamento(Departments department) {
        try {
            // sentencias preparadas: tener lista la sentencia sql
            var statement = conn.prepareStatement("INSERT INTO departments VALUES (?, ?, ?)");
            statement.setInt(1, department.getId());
            statement.setString(2, department.getName());
            statement.setInt(3, department.getLocation());
            var lineas = statement.executeUpdate();
            return lineas == 1;
            // cuando quiero capturar la excepción se pueden unir de la siguiente manera
            // esto si van a realizar lo mismo o ejecutaran la misma acción
            // catch (SQLException | FileNotFoundException ex) - de lo contrario realizar
            // varios catch
        } catch (SQLException ex) {
            return false;
        }
        // una manera de hacerlo
        /*
         * var statement = conn.createStatement();
         * var lineas = statement.executeUpdate(
         * String.
         * format("INSERT INTO departments (department_id, department_name, location_id)"
         * +
         * "VALUES (%d, '%s', %d)",
         * department.getId(), department.getName(), department.getLocation()));
         * return lineas == 1;
         */
    }

    public List<Jobs> listarCargos() throws SQLException {
        var resp = new ArrayList<Jobs>();
        var statement = conn.createStatement();
        var rset = statement.executeQuery("SELECT * FROM jobs");
        while (rset.next()) {
            var job = new Jobs();
            job.setId(rset.getInt("job_id"));
            job.setTitle(rset.getString("job_title"));
            job.setMaxsalary(rset.getDouble("max_salary"));
            job.setMinSalary(rset.getDouble("min_salary"));
            resp.add(job);
        }
        return resp;

    }
}
