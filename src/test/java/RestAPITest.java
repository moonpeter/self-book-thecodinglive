import info.thecodinglive.RestApp;
import info.thecodinglive.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApp.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAPITest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetUserById(){
        String url = "http://localhost:8080/user/0";
        User user = restTemplate.getForObject(url, User.class);
        System.out.println("등록일:" + user.getRegDate() + "," + user.getUserId() + "," + user.getUname());
    }
}
