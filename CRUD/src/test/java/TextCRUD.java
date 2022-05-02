import com.wang.mapper.StudentMapper;
import com.wang.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;

public class TextCRUD {

    @Test
    public void textInsert() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        Student s = new Student(3, "王政普", 22, "男", "2819645829@qq.com");

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int i = mapper.insertStudent(s);
        System.out.println(i);
    }
}
