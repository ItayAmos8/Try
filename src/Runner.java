

public class Runner {
    public static void main(String[] args) {
        Storage storage=new Storage();
        storage.addBook(new Book(1112,"Hello world",128.23),3);
        storage.addBook(new Book(1113,"Hasd",128.23),3);
        storage.addBook(new Book(1114,"ftrf",128.23),3);
        storage.addBook(new Book(1115,"xxx",128.23),3);
        storage.addBook(new Book(1116,"yyy",128.23),3);

        for(Book book: storage.getBooks()){
            if(book instanceof BestSeller){
                System.out.println(book.toString());
            }
            if (book instanceof Book){
                System.out.println(book);
            }
        }
    }
}
