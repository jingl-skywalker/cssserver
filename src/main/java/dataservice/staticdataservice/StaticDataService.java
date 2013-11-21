/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.staticdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import po.staticpo.CourseStaticPO;
import po.staticpo.StudentStaticPO;
import po.staticpo.TeacherStaticPO;

/**
 *
 * @author zili chen
 */
public interface StaticDataService extends Remote {

    public TeacherStaticPO find(TeacherStaticPO tpo) throws RemoteException;

    public StudentStaticPO find(StudentStaticPO spo) throws RemoteException;

    public CourseStaticPO find(CourseStaticPO cpo) throws RemoteException;
}
