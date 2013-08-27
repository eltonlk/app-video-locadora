package dao;

import framework.CreateDaoException;
import framework.DaoHelper;
import framework.DeleteDaoException;
import framework.QueryMapping;
import framework.UpdateDaoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Person;
import model.Address;

public class PersonDao {
    
    private DaoHelper daoHelper;
    
    public PersonDao() {
        daoHelper = new DaoHelper();
    }
    
    public void insert(Person person) throws CreateDaoException {
        try {
            daoHelper.begingTransaction();
                        
            String query = "INSERT INTO people (name, legal_name, kind, document_1, document_2, email, phone, cel, status) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";           
           
            int id = daoHelper.executePreparedUpdateAndReturnGenerateKeys(
                query, 
                person.getName(), 
                person.getLegalName(),    
                person.getKind(),
                person.getDocument1(),
                person.getDocument2(),
                person.getEmail(),
                person.getPhone(),
                person.getCel(),
                person.getStatus());                    
            
            person.setId(id);
            
            insertAddress(person);
            
            daoHelper.endTransaction();          
        } catch (Exception e) {
           daoHelper.rollbackTransaction();
            
           throw new CreateDaoException("Não foi possivel realizar a tranzação.", e);
        }
    }
    
    public void insertAddress(Person person) {
        Address address = person.getAddress();
            
        if ( address != null ) {   
            new AddressDao().insert(address);
        }
    }

    public void update(Person person) throws UpdateDaoException {
        try {
            daoHelper.begingTransaction();
                        
            String query = "UPDATE people SET name = ?, legal_name = ?, kind = ?, document_1 = ?, document_2 = ?, email = ?, phone = ?, cel = ?, status = ? WHERE id = ?";           
           
            daoHelper.executePreparedUpdate(
                query, 
                person.getName(), 
                person.getLegalName(),    
                person.getKind(),
                person.getDocument1(),
                person.getDocument2(),
                person.getEmail(),
                person.getPhone(),
                person.getCel(),
                person.getStatus(),
                person.getId());                    
            
            updateAddress(person);
            
            daoHelper.endTransaction();          
        } catch (Exception e) {
           daoHelper.rollbackTransaction();
            
           throw new UpdateDaoException("Não foi possivel realizar a tranzação.", e);
        }        
    }    
    
    public void updateAddress(Person person) {
        Address address = person.getAddress();
        
        if ( address != null ) {   
            new AddressDao().update(address);
        }
    }    
    
    public void delete(Person person) throws DeleteDaoException {
        try {
            daoHelper.begingTransaction();
                        
            String query = "DELETE FROM people WHERE id = ?";           
           
            daoHelper.executePreparedUpdate(
                query, 
                person.getId());                    
            
            deleteAddress(person);
            
            daoHelper.endTransaction();          
        } catch (Exception e) {
           daoHelper.rollbackTransaction();
            
           throw new DeleteDaoException("Não foi possivel realizar a tranzação.", e);
        }        
    }    
    
    public void deleteAddress(Person person) {
        Address address = person.getAddress();
        
        if ( address != null ) {   
            new AddressDao().delete(address);
        }
    }   
    
    public List<Person> getAll() {
        final List<Person> people = new ArrayList<>();
        
        try {
            daoHelper.executeQuery("SELECT * FROM people", new QueryMapping<Person>() {
                @Override
                public void mapping(ResultSet rset) throws SQLException {
                    while (rset.next()) {
                        Person person = new Person();
                        person.setId( rset.getInt("id") );
                        person.setName( rset.getString("name") );
                        person.setLegalName( rset.getString("legal_name") );
                        person.setKind( rset.getString("kind") );
                        person.setDocument1( rset.getString("document_1") );
                        person.setDocument2( rset.getString("document_2") );
                        person.setEmail( rset.getString("email") );
                        person.setPhone( rset.getString("phone") );
                        person.setCel( rset.getString("cel") );
                        
                        people.add(person);
                    }
                }
            });
        } catch (SQLException e) { }
        
        return people; 
    }
}
