package book;

import java.io.Serializable;

public class BookDTO implements Serializable {
    private String code;
    private String title;
    private String author;
    private int price;
    private int qty;
    private int total;
    
    public BookDTO(){} //에러방지

    public BookDTO(String code, String title, String author, int price, int qty) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void calc(){
        total = qty * price;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return code + "\t"  + title + "\t" + author + "\t" + price + "\t" + qty + "\t" +
                 total;
    }

}
