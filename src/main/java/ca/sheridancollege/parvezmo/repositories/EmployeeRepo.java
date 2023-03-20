package ca.sheridancollege.parvezmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.parvezmo.beans.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
