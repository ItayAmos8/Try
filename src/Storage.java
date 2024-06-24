import java.util.Arrays;

public class Storage {
    private Book[] books;
    private int[] inStock ;
    private int countInStock;

    public Storage(){
        this.books=new Book[6];
        this.inStock=new int[6];
    }

    @Override
    public String toString() {
        return "Storage{" +
                "books=" + Arrays.toString(books) +
                ", inStock=" + Arrays.toString(inStock) +
                ", countInStock=" + countInStock +
                '}';
    }
    public void addBook(Book newBook,int amount){
        books[countInStock]=newBook;
        inStock[countInStock]=amount;
        countInStock++;
    }
    public String rentBook(Book book){
        for(int i=0;i<books.length;i++){
            if(book.equals(books[i])){
                if(inStock[i]==0){
                    return null;
                }
                else
                    inStock[i]-=1;
                return books[i].getName();
            }
        }
        return null;
    }
    public int getInStock(Book book){
        for(int i=0;i<books.length;i++){
            if (book.equals(books[i])){
                return inStock[i];
            }
        }
            return -1;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int[] getInStock() {
        return inStock;
    }

    public void setInStock(int[] inStock) {
        this.inStock = inStock;
    }
}
