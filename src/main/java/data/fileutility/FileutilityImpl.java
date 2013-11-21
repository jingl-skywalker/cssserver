/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class FileutilityImpl implements FileUtility {

    String fileName;

    public FileutilityImpl() {
    }

    public FileutilityImpl(String fileName) {
        this.fileName = fileName;
    }

    private BufferedReader createReader() throws FileNotFoundException {
        FileReader fr = new FileReader(this.fileName);
        BufferedReader bf = new BufferedReader(fr);
        return bf;
    }

    private PrintWriter createPrintWriter() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(fileName);
        return writer;
    }


    public boolean append(String oneline) {
        try {
            BufferedReader bf = createReader();
            StringBuffer sbf = new StringBuffer();
            String s = null;
            while ((s = bf.readLine()) != null) {
                sbf.append(s);
                sbf.append("\r\n");
            }
            sbf.append(oneline);
            PrintWriter pw = createPrintWriter();
            pw.write(sbf.toString());
            pw.close();
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


    public boolean append(ArrayList<String> lines) {
        try {
            BufferedReader bf = createReader();
            StringBuffer sbf = new StringBuffer();
            String s = null;
            while ((s = bf.readLine()) != null) {
                sbf.append(s);
                sbf.append("\r\n");
            }
            for (String online : lines) {
                sbf.append(online);
                sbf.append("\r\n");
            }
            PrintWriter pw = createPrintWriter();
            pw.write(sbf.toString());
            pw.close();
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    public boolean append(int field, String oneTerm) {
        return false;
    }


    public String find(String ID) {
        return null;
    }

    public String find(int field, String key) {
    
        return null;
    }


    public ArrayList<String> find() {
        ArrayList<String> result = new ArrayList<String>();
        try {
            BufferedReader fr = createReader();
            String s = null;
            while ((s = fr.readLine()) != null) {
                result.add(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }


    public ArrayList<String> find(int[] fields, ArrayList<String> keys) {
        return null;
    }


    public boolean clear() {
        try {
            PrintWriter pr = createPrintWriter();
            pr.write("");
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
