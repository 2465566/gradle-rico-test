import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rico on 5/11/17.
 */
@Slf4j
public class Good {
@Autowired
    public void test() {
        try {
            System.out.println("try-catch test");
        } catch (Exception e) {
            //log.debug("1", e);
            log.debug("error", e);
        }
    }
}




