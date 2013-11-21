/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.userdataservice;

import enumeration.ResultMessage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import po.userpo.UserLoginPO;

/**
 *
 * @author Administrator
 */
public interface UserLoginDataService extends Remote {

    public ResultMessage find(UserLoginPO po) throws RemoteException;
}
