package com.survey.apps.config;

import io.r2dbc.pool.ConnectionPool;
import io.r2dbc.pool.ConnectionPoolConfiguration;
import io.r2dbc.spi.ConnectionFactory;
import org.mariadb.r2dbc.MariadbConnectionConfiguration;
import org.mariadb.r2dbc.MariadbConnectionFactory;
import org.mariadb.r2dbc.SslMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

@Configuration
@EnableR2dbcRepositories
public class R2DBCConfig extends AbstractR2dbcConfiguration {



    @Override
    @Bean
    public ConnectionFactory connectionFactory() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        try (InputStream f = loader.getResourceAsStream("db.properties")) {
            props.load(f);

            MariadbConnectionFactory mariadbConnectionFactory = new
                    MariadbConnectionFactory(MariadbConnectionConfiguration.builder()
                    .host(props.getProperty("host"))
                    .port(Integer.parseInt(props.getProperty("port")))
                    .username(props.getProperty("username"))
                    .password(props.getProperty("password"))
                    .database(props.getProperty("database"))
                    .build());

            ConnectionPoolConfiguration connectionPoolConfiguration = ConnectionPoolConfiguration
                    .builder(mariadbConnectionFactory)
                    .maxIdleTime(Duration.ofMillis(1000))
                    .maxSize(25)
                    .build();

            return new ConnectionPool(connectionPoolConfiguration);

//            return new MariadbConnectionFactory(MariadbConnectionConfiguration.builder()
//                    .host(props.getProperty("host"))
//                    .port(Integer.parseInt(props.getProperty("port")))
//                    .username(props.getProperty("username"))
//                    .password(props.getProperty("password"))
//                    .database(props.getProperty("database"))
//                    .build());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

//public class R2DBCConfig {
//
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return ConnectionFactories.get(
//                ConnectionFactoryOptions.builder()
//                        .option(DRIVER, "mariadb")
//                        .option(HOST, "lrgs-projectone.ccxh4vrlm5yb.ap-northeast-1.rds.amazonaws.com")
//                        .option(PORT, 4404)
//                        .option(USER, "projectoneapps")
//                        .option(PASSWORD, "LRGS2020surveyapps")
//                        .option(DATABASE, "surveyapps")
//                        .option(MAX_SIZE, 40)
//                        .build());
//    }
//}
