public class Book implements Cloneable {

    private String name;
    private Autor autor;

    public Book(String name, String autor) {
        this.name = name;
        this.autor = new Autor(autor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor.getName();
    }

    public void setAutor(String  s) {
        autor.setName(s);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor=" + autor +
                '}';
    }

    public Book clone() throws CloneNotSupportedException{
        Book newBook = (Book) super.clone();
        newBook.autor = (Autor) autor.clone();
        return newBook;
    }


}
