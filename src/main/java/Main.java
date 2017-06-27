import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;

/**
 * Created by qinzaizhen on 2017/6/27.
 */
public class Main {
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration = new StandaloneProcessEngineConfiguration();
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/activiti_demo?useUnicode=true&characterEncoding=UTF-8");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("123456");
        configuration.setDatabaseSchemaUpdate("true");
        configuration.buildProcessEngine();
    }
}
