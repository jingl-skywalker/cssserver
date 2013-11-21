/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.coursedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import po.coursepo.CoursePO;

/**
 *
 * @author zili chen
 */
public interface CourseDataService extends Remote {

    public void insert(CoursePO cpo) throws RemoteException;

    public void update(CoursePO cpo) throws RemoteException;

    public void delete(CoursePO cpo) throws RemoteException;

    public CoursePO find() throws RemoteException;
}
