
import static org.assertj.core.api.Assertions.assertThat;

import hillel.jee.beans.BeanExample;
import hillel.jee.beans.Colors;
import hillel.jee.beans.PropertiesLoader;
import hillel.jee.beans.bpp.ColorCodeBeanPostProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { Colors.class, PropertiesLoader.class, BeanExample.class, ColorCodeBeanPostProcessor.class })
public class AppTests {

  @Autowired
  Colors colors;

  @Autowired
  BeanExample beanExample;

  @Test
  public void contextLoads() throws Exception {
  }

  @Test
  public void propertiesHaveBeenSetCorrectly() {
    assertThat(colors.getAsHexString("black")).isEqualTo("#000000");
    assertThat(colors.getAsHexString("white")).isEqualTo("#ffffff");
  }

  @Test
  public void getAllPropsAsList() {
    assertThat(colors.getAllColorsAsHex()).contains(
        "#ffffff", "#000000"
    );
  }

  @Test
  public void beanExampleRedColorProperty() {
    assertThat(beanExample.getWhiteColorCode()).isEqualTo("#ffffff");
  }
}
