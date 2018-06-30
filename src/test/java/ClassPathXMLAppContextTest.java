import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 聪聪 on 2018/6/29 0029.
 */
public class ClassPathXMLAppContextTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mybatis-servlet.xml");

        SqlSessionFactoryBean sqlSessionFactoryBean = (SqlSessionFactoryBean) context.getBean("sqlSessionFactory");
    }
}
