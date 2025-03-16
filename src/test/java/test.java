import com.ithema.domain.user;
import com.ithema.userDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.List;

//mybaits入門案例
public class test
{
    public static void main(String[] args) throws Exception {
        //1、讀取配置文件
        InputStream in= Resources.getResourceAsStream("sqlMapconfig.xml");

        //2、創建sqlSessionFactory工廠
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        //3、 使用工廠生廠sqlSession對象
        SqlSession session=factory.openSession();

        userDao userdao=session.getMapper(userDao.class);

        List<user> users = userdao.findall();
        for(user user1:users){
            System.out.println(user1);
        }
        session.close();
        in.close();
    }
}
