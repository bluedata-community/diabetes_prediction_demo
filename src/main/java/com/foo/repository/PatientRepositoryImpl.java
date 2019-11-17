package com.foo.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.foo.domain.Patient;

/**
 * = PatientRepositoryImpl
 *
 * Implementation of PatientRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = PatientRepositoryCustom.class)
public class PatientRepositoryImpl extends QueryDslRepositorySupportExt<Patient> implements PatientRepositoryCustom{

    /**
     * Default constructor
     */
    PatientRepositoryImpl() {
        super(Patient.class);
    }
}