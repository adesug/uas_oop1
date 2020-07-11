package uas_oop.adesug_18090064.repo;

import uas_oop.adesug_18090064.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}