/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.example.dao;

import ec.edu.espe.distribuidas.example.modelo.Customer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lvald_000
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> {

    

    

    public CustomerFacade() {
        super(Customer.class);
    }
    
}
