package com.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
//@PreAuthorize("denyAll()")
public class TestAuthController {
    
    @GetMapping("/get")
//    @PreAuthorize("hasAuthority('READ')")
    public String helloGet(){
        return "Hello word - GET";
    }
    
    @PostMapping("/post")
//    @PreAuthorize("hasAuthority('CREATE') or hasAuthority('READ')")
    public String helloPost(){
        return "Hello word - POST";
    }
    
    @PutMapping("/put")
    public String helloPut(){
        return "Hello word - PUT";
    }
    
    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hello word - DELETE";
    }
    
    @PatchMapping("/patch")
//    @PreAuthorize("hasAuthority('REFACTOR')")
    public String helloPatch(){
        return "Hello word - PATCH";
    }
    
//    @GetMapping("/hello")
//    @PreAuthorize("permitAll()")
//    public String hello(){
//        return "Hello word";
//    }
//    
//    @GetMapping("/hello-secured")
//    @PreAuthorize("hasAuthority('CREATE')")
//    public String helloSecured(){
//        return "Hello word secured";
//    }
//    
//    @GetMapping("/hello-secured2")
//    public String helloSecured2(){
//        return "Hello word secured2";
//    }
    
}
