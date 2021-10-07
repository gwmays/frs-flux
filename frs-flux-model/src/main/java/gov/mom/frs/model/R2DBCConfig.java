package gov.mom.frs.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import static io.r2dbc.spi.ConnectionFactoryOptions.DATABASE;
import static io.r2dbc.spi.ConnectionFactoryOptions.DRIVER ;
import static io.r2dbc.spi.ConnectionFactoryOptions.HOST ;
import static io.r2dbc.spi.ConnectionFactoryOptions.USER;
import static io.r2dbc.spi.ConnectionFactoryOptions.PASSWORD;
import static io.r2dbc.spi.ConnectionFactoryOptions.PORT; 
//
//@Configuration
//@EnableR2dbcRepositories(basePackages = { "gov.mom.frs.model.repositories" })
//public class R2DBCConfig {
//	
//	String url = "r2dbc:postgresql://172.17.0.2:5432/itg_frs?schema=frsdb";
//
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        return ConnectionFactories.get(
//                ConnectionFactoryOptions.builder()
//                        .option(DRIVER, "postgresql")
//                        .option(HOST, "localhost")
//                        .option(PORT, 5432)
//                        .option(USER, "gwmays")
//                        .option(PASSWORD, "password")
//                        .option(DATABASE, "itg_frs")
//                        .build().parse( url ) ) ;
//    }
//
//}