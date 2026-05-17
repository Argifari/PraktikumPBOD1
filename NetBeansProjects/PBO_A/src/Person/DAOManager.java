/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author argif
 */
public class DAOManager {
    private MySQLPersonDAO personDAO;
    
    public void setPersonDAO(MySQLPersonDAO person) {
        personDAO = person;
    }
    public MySQLPersonDAO getPersonDAO() {
        return personDAO;
    }
}
