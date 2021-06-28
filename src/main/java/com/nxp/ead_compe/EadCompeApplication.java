package com.nxp.ead_compe;

import com.nxp.ead_compe.utils.Migrate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EadCompeApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EadCompeApplication.class, args);
        Migrate migrate = ctx.getBean(Migrate.class);
        migrate.dataSeeding();
    }

}
