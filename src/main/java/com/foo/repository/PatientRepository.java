package com.foo.repository;
import com.foo.domain.Patient;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PatientRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Patient.class)
public interface PatientRepository extends DetachableJpaRepository<Patient, Long>, PatientRepositoryCustom {
}
