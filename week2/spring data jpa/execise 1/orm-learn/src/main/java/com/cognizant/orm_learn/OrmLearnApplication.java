package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class,args);

        countryService = context.getBean(CountryService.class);

        testFindCountry();

        testAddCountry();

        testUpdateCountry();

        testDeleteCountry();

        testSearchCountry();
    }

    private static void testFindCountry() {

        LOGGER.info("Start");

        Country country = countryService.findCountryByCode("IN");

        LOGGER.debug("Country={}", country);

        LOGGER.info("End");
    }

    private static void testAddCountry() {

        LOGGER.info("Start");

        Country country = new Country();

        country.setCode("JP");
        country.setName("Japan");

        countryService.addCountry(country);

        LOGGER.debug("Country={}",countryService.findCountryByCode("JP"));

        LOGGER.info("End");
    }

    private static void testUpdateCountry() {

        LOGGER.info("Start");

        Country country = countryService.findCountryByCode("JP");

        country.setName("Japan Updated");

        countryService.updateCountry(country);

        LOGGER.debug("Country={}",countryService.findCountryByCode("JP"));

        LOGGER.info("End");
    }

    private static void testDeleteCountry() {

        LOGGER.info("Start");

        countryService.deleteCountry("JP");

        LOGGER.info("JP deleted");

        LOGGER.info("End");
    }

    private static void testSearchCountry() {

        LOGGER.info("Start");

        List<Country> countries = countryService.searchCountry("Uni");

        LOGGER.debug("Countries={}",countries);

        LOGGER.info("End");
    }
}