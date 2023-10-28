package case_study.repository;

import case_study.model.Contract;

import java.util.List;
import java.util.TreeSet;

public interface IContactRepository {
    //3.Create new contracts
//4.Display list contracts
//5.Edit contracts
    List<Contract> showCotract();

    void addNewContract(Contract contract);

    void editContract(int code, Contract contract);

    int checkContract(int code);

}
