public class Autor implements Cloneable{
    private String name;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Autor clone() throws CloneNotSupportedException{
        return (Autor) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Book b = new Book("War and Peac", "lev" );
        Book b2 = b.clone();

        b2.setAutor("Ivan Turgenev");

        System.out.println(b2.getAutor());
        System.out.println(b.getAutor());


    }
}
