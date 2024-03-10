import org.example.db.DbConection;
import org.example.db.User;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class TestDb {
    @Test
    public void tester() throws SQLException {
        DbConection.open("Employees");
        List<User> user = User.getAllUser();
        List <User > users= user.stream().filter(e->e.getFirst_name().equals("Malu") && e.getGender().equals("M")).map(e->e).collect(Collectors.toList());
        System.out.println(users.size());
        DbConection.closeDb();
    }
}
