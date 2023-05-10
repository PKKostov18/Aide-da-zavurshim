public class MyMagazine extends Magazine
{
    private String title;

    public MyMagazine(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void getDetails() {
        System.out.println(title + " " + getName()+  " " + getAuthor() + " " + getPrice());
    }
}
