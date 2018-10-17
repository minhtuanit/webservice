package Controller;

import Persistence.Email;
import Persistence.Employee;
import Service.AuthorizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {
    private AuthorizationService authorizationService;

    public AuthorizationController(){
        authorizationService = new AuthorizationService();
    }

    @RequestMapping(value = "/authorization/checklogin",method = RequestMethod.POST)
    public ResponseEntity<Object> checkLogin(@RequestBody Email email) {
        Employee employee = authorizationService.checkLogin(email);
        if(employee != null)
            return ResponseEntity.ok().header("Success").body(employee);
        return ResponseEntity.notFound().header("failed").build();
    }

}
