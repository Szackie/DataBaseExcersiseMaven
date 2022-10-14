public class App {
    public static void main(String[] args) {

ProductRepository repository=new ProductRepository();
repository.addNewProduct(new Products(1,"Mleko",11.3,"4%"));
repository.addNewProduct(new Products(2,"Jajko",1.3,"z wolnego wybiegu"));

    }
}
