package learn;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

/**
 * @author zhengjianglong
 * @since 2018-04-05
 */
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad() {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("test-spring.xml"));
        MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
        assertEquals("testStr", bean.getTestStr());

    }
}
