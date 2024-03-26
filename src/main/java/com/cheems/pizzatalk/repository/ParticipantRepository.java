package com.cheems.pizzatalk.repository;

import com.cheems.pizzatalk.entities.ParticipantEntity;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<ParticipantEntity, Long>, JpaSpecificationExecutor<ParticipantEntity> {
    @SuppressWarnings("NullableProblems")
    List<ParticipantEntity> findAll(@Nullable Specification<ParticipantEntity> spec);

    @SuppressWarnings("NullableProblems")
    Page<ParticipantEntity> findAll(@Nullable Specification<ParticipantEntity> spec, Pageable pageable);
}
