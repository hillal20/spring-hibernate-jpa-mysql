package springHibernateJpaMysql.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/working")
public class TestController {

    @GetMapping("/")
    public ResponseEntity<?> working(){
        return  new ResponseEntity<>("working", HttpStatus.OK);
    }
}
