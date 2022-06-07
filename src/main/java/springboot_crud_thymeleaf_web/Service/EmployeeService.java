package springboot_crud_thymeleaf_web.Service;

import org.springframework.data.domain.Page;
import springboot_crud_thymeleaf_web.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    Page< Employee > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}
