package pl.wawszczak.recruitmenttaskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wawszczak.recruitmenttaskapp.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
