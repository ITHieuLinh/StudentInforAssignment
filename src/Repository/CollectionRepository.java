package Repository;

import DataAccess.CollectionDAO;
import java.util.ArrayList;
import model.Student;

public class CollectionRepository implements ICollectionRepository {

    @Override
    public void display(ArrayList<Student> lt) {
        CollectionDAO.Instance().display(lt);
    }

}
