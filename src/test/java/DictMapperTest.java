import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.congcong.mySpringMyBatis.mapper.DictMapper;
import pers.congcong.mySpringMyBatis.web.model.SysDict;

/**
 * Created by 聪聪 on 2018/6/28 0028.
 */
@Component
public class DictMapperTest {

    SqlSessionTemplate sqlSessionTemplate;


    @Test
    public void testSelectById() {

        try {
            DictMapper dictMapper = sqlSessionTemplate.getMapper(DictMapper.class);
            SysDict sysDict = dictMapper.selectByPrimaryKey(1l);

            Assert.assertNotNull(sysDict);
        } finally {

        }

    }
}
