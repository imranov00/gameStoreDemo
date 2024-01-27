package Abstract;
import Entities.Customer;
import Entities.Games;


public interface IGameService {
    void addToCustomer(Customer customer, Games games);
    void deleteToCustomer(Customer customer, Games games);
}
