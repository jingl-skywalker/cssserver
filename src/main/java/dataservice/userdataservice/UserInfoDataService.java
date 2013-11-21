/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.userdataservice;

import enumeration.ResultMessage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import po.userpo.UserInfoPO;

/**
 *
 * @author Administrator
 */
public interface UserInfoDataService extends Remote {

    public ResultMessage insert(ArrayList<UserInfoPO> pos) throws RemoteException;

    public ResultMessage update(String ID, UserInfoPO po) throws RemoteException;

    public ResultMessage delete(UserInfoPO po) throws RemoteException;

    public ArrayList<UserInfoPO> find(String type) throws RemoteException;
    //question here
}
