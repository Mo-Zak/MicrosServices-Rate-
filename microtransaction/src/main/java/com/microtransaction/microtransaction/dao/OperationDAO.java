package com.microtransaction.microtransaction.dao;

import com.microtransaction.microtransaction.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationDAO extends JpaRepository<Operation, Integer>{

    Operation findById(int id);
    void deleteById(int id);
}
