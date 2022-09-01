public class Book {
   private String title;
   private String isbn;
   private String publisher;
   private int page;

    //constructor
    public Book(){
        System.out.printf("Book constructor invoke...%n");
    }

    //method
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setPublisher(String publiser){
        this.publisher = publiser;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public void setPage(int page){
        this.page = page;
    }

    public int getPage(){
        return this.page;
    }

    public void showDetail(){
        System.out.printf("{title : %s, isbn : %s, publisher : %s, page : %d}", title, isbn, publisher, page);
    }
}
