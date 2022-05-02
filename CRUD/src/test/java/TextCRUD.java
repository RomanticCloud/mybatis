import com.wang.mapper.StudentMapper;
import com.wang.pojo.Student;
import com.wang.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.io.IOException;

public class TextCRUD {

    @Test
    public void textInsert() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        Student s = new Student(4, "王政普", 22, "男", "2819645829@qq.com");

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int i = mapper.insertStudent(s);
        System.out.println(i);
    }
}
