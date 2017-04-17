import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.RemoteServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by thucnt on 12/26/16.
 */
@Configuration
@EnableNeo4jRepositories("repository")
@EnableTransactionManagement
public class AppContext extends Neo4jConfiguration {

    public static final String NEO4J_HOST = "http://localhost:";
    public static final int    NEO4J_PORT = 7474;

    @Override
    public SessionFactory getSessionFactory() {
        System.setProperty("username", "neo4j");
        System.setProperty("password", System.getProperty("password","thuc1980"));
        return new SessionFactory("domain");
    }

    @Bean
    public RemoteServer neo4jServer() {
        return new RemoteServer(NEO4J_HOST + NEO4J_PORT);
    }

    @Bean
    @Override
    //@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session getSession() throws Exception {
        return super.getSession();
    }

}
