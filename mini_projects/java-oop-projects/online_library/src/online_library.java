import java.util.Scanner;

class Book {
    String bookNo;
    String bookTitle;
    String author;
    int yearPublished;

    public Book(String bookNo, String bookTitle, String author, int yearPublished) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void showBookNo(){
        System.out.println("书号: " + bookNo);
    }
    public void showBookTitle(){
        System.out.println("书名: " + bookTitle);
    }
    public void showAuthor(){
        System.out.println("作者: " + author);
    }
    public void showYearPublished(){
        System.out.println("出版年份: " + yearPublished);
    }

    public void modifyYearPublished(int newYear){
        yearPublished = newYear;
    }
}

public class online_library {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Book b1 = new Book("ISBN123456789", "Java Programming", "John Doe", 2024);
        Book b2 = new Book("ISBN987654321", "Data Structures", "Jane Smith", 2023);

        System.out.println("=== b1 信息 ===");
        b1.showBookNo();
        b1.showBookTitle();
        b1.showAuthor();
        b1.showYearPublished();

        System.out.println("=== b2 信息 ===");
        b2.showBookNo();
        b2.showBookTitle();
        b2.showAuthor();
        b2.showYearPublished();

        System.out.print("修改b1出版年份为：");
        int newYear=scanner.nextInt();
        b1.modifyYearPublished(newYear);
        System.out.println("=== 修改后 b1 信息 ===");
        b1.showBookNo();
        b1.showBookTitle();
        b1.showAuthor();
        b1.showYearPublished();

        scanner.close();
    }
}