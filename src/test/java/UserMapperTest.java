import com.gemjy.dao.System_userMapper;
import com.gemjy.pojo.System_user;
import com.test.dao.UserMapper;
import com.test.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserMapperTest {

    @Autowired
    //private UserMapper userMapper;
    private System_userMapper system_userMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {
        int id = 3;
        //User user = userMapper.selectByPrimaryKey(String.valueOf(id));
        //System.out.println("用户名："+user.getUserName()+"  密码:"+user.getPassword());


        System_user system_user = system_userMapper.selectByPrimaryKey(String.valueOf(id));
        System.out.println(system_user.getUserName());
    }
    public void test1() {
        Person person = new Person();
        person.setMail("114336");
        person.setPassword("114336");

        logger.info(personService.loginPerson(person));
        logger.info("ws");
    }
}
