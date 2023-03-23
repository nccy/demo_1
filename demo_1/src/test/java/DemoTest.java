import com.hnust.entity.Course;
import com.hnust.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * @author 长夜
 * @date 2023/3/20 20:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DemoTest {
    @Autowired
    private CourseService courseService;
    @Test
    public void testSelectById(){
        int id = 2;
        Course course= courseService.selectById(id);
        System.out.println(course);
    }
    @Test
    public void testSelectByscName(){
        String name = "计算机学院";
        List<Course> course = courseService.selectByscName(name);
        System.out.println(course);
    }
    @Test
    public void testUpdate(){
        int id = 4;
        int hours = 32;
        Course course=new Course();
        course.setId(id);
        course.setHours(hours);
        Integer num= courseService.update(course);
        if(num==1)
        {
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }
    //注意关闭IEDA->setting->Runner->delegate ide build/run actions to maven
    //不然会出现统一数据添加两次的情况
    @Test
    public void testInsert(){
        Integer hours = 32;
        String name = "大数据存储";
        Integer schools = 1;
        Course course=new Course();
        course.setName(name);
        course.setHours(hours);
        course.setSchools(schools);
        Integer num= courseService.insertAutoId(course);
        if(num==1)
        {
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    @Test
    public void testSelectAll(){
        List<Course> course = courseService.selectAll();
        System.out.println(course);
    }
}
