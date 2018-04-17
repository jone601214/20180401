public class book {

    public String name, author, publisher, coding;

    public book(String name1, String author1, String publisher1, String coding1) {
        this.setName(name1);
        this.setauthor(author1);
        this.setpublisher(publisher1);
        this.setcoding(coding1);
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public void setauthor(String author1) {
        this.author = author1;
    }

    public String getauthor() {
        return author;
    }

    public void setpublisher(String publisher1) {
        this.publisher = publisher1;
    }

    public String getpublisher() {
        return publisher;
    }

    public void setcoding(String coding1) {
        this.coding = coding1;
    }

    public String getcoding() {
        return coding;
    }
}