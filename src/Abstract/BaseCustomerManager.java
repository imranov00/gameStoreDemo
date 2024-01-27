package Abstract;
import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {
    public BaseCustomerManager(int i, String heartsOfIronIv, String number) {
    }

    @Override
    public void save(Customer customer){
        System.out.println(customer.getFirstName()+ " Veri tabanına Kaydedildi ");

    }
    public void delete(Customer customer){
        System.out.println(customer.getFirstName() + " Veri tabanından silindi " );
    }
    public void update(Customer customer){
        System.out.println(customer.getFirstName() + " Veri tabanı bilgileri güncellendi");

    }

}
