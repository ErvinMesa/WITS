package UML;

public class Library {
    public String name;
    public String[] Books;
    public String[] Sections;
    public int BookCount;
    private int Sales;

    Library(){

    }

    public void transact(String[] Books, int amount){}
    private void addSales(int amount){}
    public int getBookCount(){return this.BookCount;}
    public void addBook(String book){}
    public void addBookCount(int count){}
    public String[] listBooks(){
        return Books;
    }
}
