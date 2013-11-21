/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.datafactory;

import dataservice.framedataservice.FrameDataService;
import dataservice.plandataservice.PlanDataService;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import dataservice.processmngdataservice.statedataservice.StateDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public interface AbstractDataFactory extends Remote {

    public FrameDataService getFrameData() throws RemoteException;

    public PlanDataService getPlanData() throws RemoteException;
	public StateDataService getStateData()throws RemoteException;
	public NoticeDataService getNoticeDataService() throws RemoteException;
    
}
