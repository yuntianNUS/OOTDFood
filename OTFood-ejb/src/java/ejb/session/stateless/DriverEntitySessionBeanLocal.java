/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.DriverEntity;
import java.util.List;
import javax.ejb.Local;
import util.exception.DriverExistsException;
import util.exception.DriverNotFoundException;
import util.exception.InputDataValidationException;
import util.exception.UnknownPersistenceException;

/**
 *
 * @author yuntiangu
 */
@Local
public interface DriverEntitySessionBeanLocal {

    public List<DriverEntity> retrieveAllDrivers();

    public DriverEntity retrieveDriverById(Long driverId) throws DriverNotFoundException;

    public List<DriverEntity> retrieveDriverByName(String driverName);

    public Long createNewDriver(DriverEntity driver) throws UnknownPersistenceException, InputDataValidationException, DriverExistsException;
    
}
