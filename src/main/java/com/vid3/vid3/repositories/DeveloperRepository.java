package com.vid3.vid3.repositories;

import com.vid3.vid3.models.developer.Developer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    List<Developer> findAllByCohort(Integer cohort, Sort sort);
    List<Developer> findAllByLanguages_id(Long id);
//    @Query("SELECT * FROM developer WHERE cohort = ?1 AND ?2 in languages")
//    Developer findByCohortAndLanguage(Integer cohort, String language);
}