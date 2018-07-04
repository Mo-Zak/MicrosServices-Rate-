package com.change.microchange.dao;
import com.change.microchange.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RateDAO extends JpaRepository<Rate, Long>{

    Rate findByCurrencySourceAndCurrencyDestinationAndDate(String currencySource, String currencyDestination, String date);
    Rate findById(int id);
    void deleteById(int id);

}