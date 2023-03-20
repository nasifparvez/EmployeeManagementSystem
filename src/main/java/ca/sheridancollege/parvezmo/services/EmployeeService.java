package ca.sheridancollege.parvezmo.services;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import ca.sheridancollege.parvezmo.beans.Employee;
import ca.sheridancollege.parvezmo.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	
	public void addEmp(Employee employee) {
		empRepo.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	public Employee getEmployeeById(Long id) {
		Optional<Employee> e = empRepo.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}

	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);
	}

	public Page<Employee> getEmployeeByPaginate(int currentPage, int size) {
		PageRequest p = PageRequest.of(currentPage, size);
		return empRepo.findAll(p);
	}
	


}
