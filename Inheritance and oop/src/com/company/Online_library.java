package com.company;
class library{
    String books[];
    int noofbooks = 0;
    library(){
        this.books = new String[100];
        this.noofbooks = 0;
    }
    public void addbook(String book){
        this.books[noofbooks]= book;
        noofbooks++;
        System.out.println( book+" has been added. ");
    }
    public void showAvailablebooks(){
        System.out.println("Available books are: ");

        for (String book:this.books) {
            if (book==null){
                continue;
            }
            System.out.println("*"+book);
        }

    }
    public void issueBook(String book){
        {
            for (int i = 0; i < this.books.length; i++) {
                String b = this.books[i];

                if (b == book) {
                    System.out.println("The book has been issued");
                    this.books[i] =null;
                    return ;
                }

            }
            System.out.println("This book does not exist");
        }
    }
    public void returnBook(String book){
        addbook(book);
    }
}
public class Online_library {
    public static void main(String[]args){
        library l = new library();
        l.addbook("rich dad poor dad ");
        l.addbook("21 days of communication.");
        l.addbook("how to win friends ");
        l.addbook("Think and grow rich");
        l.addbook("stephen king the it");
        l.addbook("1984");
        l.showAvailablebooks();
        l.issueBook("rich dad poor dad ");
        l.showAvailablebooks();
        l.returnBook("rich dad poor dad ");
        l.showAvailablebooks();


    }
}
