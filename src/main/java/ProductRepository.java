import java.util.List;

public class ProductRepository {

    public Products addNewProduct(Products newProduct){
         var session = HibernateUtil.getSessionFactory().openSession();
         var transaction = session.beginTransaction();

         session.persist("Products",newProduct);

         transaction.commit();
         session.close();
         return newProduct;
    }


        public void deleteProduct(Integer id){
        var session= HibernateUtil.getSessionFactory().openSession();
        var transaction=session.beginTransaction();

        var product = session.load(Products.class,id);
        session.delete("PRODUCTS",product);


        transaction.commit();
        session.close();
    }

public List<Products> findAll(){
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.createQuery("from Products",Products.class).list();
transaction.commit();
session.close();

        return result;
    }


}
