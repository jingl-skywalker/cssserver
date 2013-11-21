package data.datafactory;

import java.rmi.RemoteException;

import dataservice.framedataservice.FrameDataService;
import dataservice.plandataservice.PlanDataService;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import dataservice.processmngdataservice.statedataservice.StateDataService;
public class DataFactoryImpl implements AbstractDataFactory{

	public FrameDataService getFrameData() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public PlanDataService getPlanData() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public StateDataService getStateData()throws RemoteException{
		return null;
	}

	public NoticeDataService getNoticeDataService() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



}
