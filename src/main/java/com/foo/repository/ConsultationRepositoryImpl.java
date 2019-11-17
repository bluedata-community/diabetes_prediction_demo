package com.foo.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.foo.domain.Consultation;

/**
 * = ConsultationRepositoryImpl
 *
 * Implementation of ConsultationRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ConsultationRepositoryCustom.class)
public class ConsultationRepositoryImpl extends QueryDslRepositorySupportExt<Consultation> implements ConsultationRepositoryCustom{

    /**
     * Default constructor
     */
    ConsultationRepositoryImpl() {
        super(Consultation.class);
    }
}