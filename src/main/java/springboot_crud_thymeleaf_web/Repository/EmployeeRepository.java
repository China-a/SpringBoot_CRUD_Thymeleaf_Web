package springboot_crud_thymeleaf_web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot_crud_thymeleaf_web.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
