/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface FileUtility {
        public boolean append(String oneline);

    public boolean append(ArrayList<String> lines);

    public boolean append(int field, String oneTerm);

    public String find(String ID);

    public String find(int field, String key);

    public ArrayList<String> find();

    public ArrayList<String> find(int[] fields, ArrayList<String> keys);

    public boolean clear();
}
