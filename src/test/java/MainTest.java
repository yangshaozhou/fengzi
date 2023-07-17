import com.alibaba.fastjson.JSON;
import com.example.entity.User;
import org.junit.jupiter.api.Test;

public class MainTest {
//    将实体类转换为json格式
    @Test
    public void test(){
        User user=new User();
        user.setUsername("zs");
        user.setPassword("12233");
        System.out.println(JSON.toJSON(user));
    }
}
