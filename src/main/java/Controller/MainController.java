package Controller;

import Model.ModelSearchInput;
import Model.ModelSearchOutput;
import Service.MainService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MainController {

    private MainService mainService;

    public MainController(){
        mainService = new MainService();
    }

    @RequestMapping(path = "/main/search/{projectid}/{timeview}/{fromdate}/{todate}",method = RequestMethod.GET)
    public ResponseEntity<Object> SearchProject(@PathVariable Integer projectid,
                                                 @PathVariable Integer timeview,
                                                 @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromdate,
                                                 @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date todate) {
        ModelSearchInput input = new ModelSearchInput(projectid,timeview,fromdate,todate);
        List<ModelSearchOutput> searchOutputList = mainService.Search(input);
        return new ResponseEntity<>(searchOutputList, HttpStatus.OK);
    }
}
