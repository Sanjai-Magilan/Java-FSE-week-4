package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(
            String countryCode) {

        Optional<Country> result =
                countryRepository.findById(countryCode);

        if (result.isEmpty()) {
            throw new CountryNotFoundException(
                    "Country not found : "
                            + countryCode);
        }

        return result.get();
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(
            Country country) {

        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(
            String countryCode) {

        countryRepository.deleteById(
                countryCode);
    }

    @Transactional
    public List<Country> searchCountry(
            String name) {

        return countryRepository
                .findByNameContainingIgnoreCase(
                        name);
    }
}