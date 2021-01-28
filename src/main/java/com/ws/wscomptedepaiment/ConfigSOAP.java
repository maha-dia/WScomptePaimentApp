package com.ws.wscomptedepaiment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
@Configuration
public class ConfigSOAP {
    @Bean
    SimpleJaxWsServiceExporter exporter(){
        SimpleJaxWsServiceExporter serviceExporter= new SimpleJaxWsServiceExporter();
        serviceExporter.setBaseAddress("http://0.0.0.0:8077/");
        return serviceExporter;
    }
}
