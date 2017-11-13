package vo;
 
// full package ¿Ã∏ß¿∫ vo.BookVO
public class BookVO {
    private int jBookNum;
    private String jTitle;
    private String jPublisher;
    private String jWriter;
    private int jPrice;
////////////////////////////////////////////////////////    
    public int getjBookNum() {
        return jBookNum;
    }
    public void setjBookNum(int jBookNum) {
        this.jBookNum = jBookNum;
    }
    public String getjTitle() {
        return jTitle;
    }
    public void setjTitle(String jTitle) {
        this.jTitle = jTitle;
    }
    public String getjPublisher() {
        return jPublisher;
    }
    public void setjPublisher(String jPublisher) {
        this.jPublisher = jPublisher;
    }
    public String getjWriter() {
        return jWriter;
    }
    public void setjWriter(String jWriter) {
        this.jWriter = jWriter;
    }
    public int getjPrice() {
        return jPrice;
    }
    public void setjPrice(int jPrice) {
        this.jPrice = jPrice;
    }
    @Override
    public String toString() {
        return "BookVO [jBookNum=" + jBookNum + ", jTitle=" + jTitle + ", jPublisher=" + jPublisher + ", jWriter="
                + jWriter + ", jPrice=" + jPrice + "]";
    }
}