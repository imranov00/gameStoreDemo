import Abstract.BaseCustomerManager;
import Abstract.BaseGameManager;
import Concrete.SubscribeCustomer;
import Entities.Customer;



public class Main {
    public static void main(String[] args) {
        Customer emin = new Customer();
        emin.setId(1);
        emin.setFirstName("Emin");
        emin.setLastName("İmranov");
        emin.setNationalityId("1234567897");


        BaseCustomerManager customerManager = new SubscribeCustomer(1,"hoi4","2000");


        customerManager.save(emin);
        customerManager.update(emin);
        customerManager.delete(emin);

        BaseGameManager gameManager = new BaseGameManager(1,"Hearts Of Iron IV", "2000");
        gameManager.addToCustomer(emin,gameManager);



    }
}