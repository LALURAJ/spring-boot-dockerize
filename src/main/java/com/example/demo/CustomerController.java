package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController{

  @GetMapping("/users")
  public List<String> getAllUsers(){
    return new ArrayList<>(Arrays.asList("Ramu","Test","Wedd"));
  }

}
