package com.diegomoreno.devjava.example3;

import java.sql.Connection;
import java.sql.SQLException;

import com.diegomoreno.devjava.example3.dto.Departments;

public class App {

    public static void main(String[] args) {
        var baseDatos = new BaseDatos();
        var archivoDB = "D:\\MISION TIC 2022\\Programacion Basica Java\\Proyectos-Java\\SQL\\hr.db";
        try {
            var connection = baseDatos.getConnection("jdbc:sqlite:" + archivoDB);
            System.out.println("Se a conectado exitosamente a la base de datos");

            // Crear Tabla departamento
            var departamento = new Departments();
            departamento.setId(-1);
            departamento.setName("Mi departamento negativo");
            departamento.setLocation(1700);
            baseDatos.crearDepartamento(departamento);

            // pruebaTablaDemo(connection);
            // una manera de hacerlo
            baseDatos.listarDepartamentos()
                .forEach(System.out::println);

            // otra manera de hacerlo
            //baseDatos.listarDepartamentos()
            //        .forEach(App::mostrarEnPantalla);
            //baseDatos.closeConnection();

            /* 
            baseDatos.listarCargos()
                    .forEach(System.out::println);
            baseDatos.closeConnection(); */

        } catch (SQLException ex) {
            System.err.println("Existe un problema al conectar a la base de datos: \n"
                    + ex.getMessage());
        }

    }

    private static void mostrarEnPantalla(Departments d) {
        System.out.println(d);
    }

    private static void pruebaTablaDemo(Connection connection) throws SQLException {
        var statement = connection.createStatement();
        // statement.execute("CREATE TABLE DEMO (ID INTEGER NOT NULL, NAME VARCHAR(200)
        // NOT NULL, CONSTRAINT DEMO_PK PRIMARY KEY (ID));");
        // statement.execute("insert into demo (id, name) values (1,'Datos
        // iniciales');");
        // statement.execute("insert into demo (id, name) values (2,'Datos
        // iniciales');");
        var rset = statement.executeQuery("SELECT * FROM DEMO");
        while (rset.next()) {
            System.out.printf("ID: %d \t", rset.getInt("ID"));
            System.out.printf("NAME: %s %n", rset.getString("name"));
        }
        rset.close();
    }
}
