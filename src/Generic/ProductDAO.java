package Generic;

public class ProductDAO extends DAO<Product>{

    @Override
    public Product findItem(int id) {
        for(Product product : super.list)
        {
            if(product.getId() == id)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public void updateItem(Product newObject, int id) {
        for(int i =  0; i <  super.list.size(); i++)
        {
            if(list.get(i).getId() == id)
            {
                list.set(i,newObject);
                return;
            }
        }
        super.addItem(newObject);
    }
}
