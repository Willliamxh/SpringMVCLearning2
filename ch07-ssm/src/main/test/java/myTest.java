import com.bjp.domain.Student;
import com.bjp.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test02(){
        String config="conf/applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("容器中的名称："+beanDefinitionName+"||"+ctx.getBean(beanDefinitionName));
        }


    }

    @Test
    public void test01(){
        String config="conf/applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        /*获取spring容器中的dao对象*/

        /*获取spring容器中的dao对象*/
        StudentService studentService= (StudentService) ctx.getBean("studentServiceImpl");


        Student student=new Student();
        student.setName("许晗2");
        student.setAge(26);

        /*spring和mybatis整合在一起使用，事务是自动提交的。无需执行sqlSession.commit*/
        int nums = studentService.addStudent(student);
        System.out.println("nums: "+nums);





    }
}
