package com.foo.repository;
import com.foo.domain.Consultation;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ConsultationRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Consultation.class)
public interface ConsultationRepository extends DetachableJpaRepository<Consultation, Long>, ConsultationRepositoryCustom {
}
