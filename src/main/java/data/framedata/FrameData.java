package data.framedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.framepo.FramePO;

import dataservice.framedataservice.FrameDataService;

public class FrameData extends UnicastRemoteObject implements FrameDataService{

	protected FrameData() throws RemoteException {
	}

	public void insert(FramePO fpo) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	public void update(FramePO fpo) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	public FramePO find() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
