/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.framepo;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FramePO {

    private int total;
    private String base;
    private ArrayList<BlockPO> blocks = new ArrayList<BlockPO>();
    private boolean isPublic=false;

    public FramePO(int total, String base) {
        this.total = total;
        this.base = base;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void addBlock(BlockPO blockPO) {
        getBlocks().add(blockPO);
    }
    public void setPublic(){
        this.setIsPublic(true);
    }

    public ArrayList<BlockPO> getBlocks() {
        return blocks;
    }

    public void setBlocks(ArrayList<BlockPO> blocks) {
        this.blocks = blocks;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
}
