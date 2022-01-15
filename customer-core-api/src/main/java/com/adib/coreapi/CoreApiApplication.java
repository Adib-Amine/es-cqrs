package com.adib.coreapi;

import com.adib.coreapi.events.AccountActivatedEvent;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApiApplication {

    public static void main(String[] args) {
//        Class<?>[] classes = new Class[] { AccountActivatedEvent.class };
//        XStream xstream = new XStream();
//        XStream.setupDefaultSecurity(xstream);
//        xstream.addPermission(AnyTypePermission.ANY);
//        xstream.allowTypes(classes);
        SpringApplication.run(CoreApiApplication.class, args);
    }

}
