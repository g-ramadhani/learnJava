public class BookExecutor {
    public static void main(String[] args) {
        Book myBook = new Book();

        System.out.printf("Data Buku sebelum diisi%n");
        myBook.showDetail();
        myBook.setTitle("Senopati Pamungkas #1");
        myBook.setIsbn("978979225954");
        myBook.setPublisher("Gramedia Pustaka Utama");
        myBook.setPage(560);

        System.out.printf("%n%nData Buku setelah diisi%n");
        System.out.printf("Title\t  : %s%n", myBook.getTitle());
        System.out.printf("ISBN\t  : %s%n", myBook.getIsbn());
        System.out.printf("Publisher : %s%n", myBook.getPublisher());
        System.out.printf("Page\t  : %d%n", myBook.getPage());
    }
}
