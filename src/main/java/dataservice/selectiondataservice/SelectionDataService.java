/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.selectiondataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import po.selectionpo.SelectionPO;

/**
 *
 * @author Administrator
 */
public interface SelectionDataService extends Remote {

    public void insert(SelectionPO po) throws RemoteException;

    public void delete(String ID, String Num) throws RemoteException;

    public SelectionPO find(String ID, String Num) throws RemoteException;
}
