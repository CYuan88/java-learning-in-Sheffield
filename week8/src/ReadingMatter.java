/*
  Cleaned up: 31/08/06 by YG
*/

public class ReadingMatter {
    protected int pageCount;
    protected int serialNumber;
    protected String title;

    public ReadingMatter() {
    }
    public ReadingMatter(String ti, int pc) {
        pageCount = pc;
        title = ti;
    }

    public void setPageCount(int p) {
        pageCount = p;
    }
    public void setSerialNumber(int s) {
        serialNumber = s;
    }
    public void setTitle(String t) {
        title = t;
    }

    public int getPageCount() {
        return pageCount;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public String getTitle() {
        return title;
    }

    public String toString() {
        return ("Reading matter entitled: " + title +
                " (" + pageCount + " pages).");
    }
}