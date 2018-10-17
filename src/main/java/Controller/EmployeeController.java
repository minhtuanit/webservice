package Controller;

import Persistence.Email;
import Persistence.Employee;
import Service.EmployeeService;
import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(){
        employeeService = new EmployeeService();
    }

    @RequestMapping(value = "/employee/getallemployee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>>getListEmployee() {
        List<Employee> employeeList = employeeService.GetListEmployee();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
    @RequestMapping(value = "/employee/update",method = RequestMethod.POST)
    public ResponseEntity<Object> UpdateEmployee(@RequestBody Employee employee) {
       boolean check = employeeService.UpdateEmployee(employee);
       if( check ){
           return new ResponseEntity<>("Update Success", HttpStatus.OK);
       }
       else{
           return new ResponseEntity<>("Update don't success", HttpStatus.NOT_FOUND);
       }
    }

    @RequestMapping(value = "/employee/add",method = RequestMethod.PUT)
    public ResponseEntity<Object> AddEmployee(@RequestBody Employee employee) {
        boolean check = employeeService.InsertEmployee(employee);
        if( check ){
            return new ResponseEntity<>("Insert Success", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Insert don't success", HttpStatus.NOT_FOUND);
        }
    }

}
