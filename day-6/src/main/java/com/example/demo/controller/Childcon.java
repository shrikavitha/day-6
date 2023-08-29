package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.Childser;

@RestController
public class Childcon {
@Autowired
Childser cser;
@PostMapping("addall")
public List<Child> addALL(@RequestBody List<Child> c){
	return cser.add(c);
}
@GetMapping("show")
public List<Child> show(){
	return cser.show();
}
@PutMapping("modify")
public Child update(Child c) {
	return cser.update(c);
}
@DeleteMapping("del/{id}")
public String del(@PathVariable int id) {
	cser.deleteid(id);
	return "Deleted";
}
@GetMapping("show/{name}")
public List<Child> sort(@PathVariable String  name){
	return cser.sortinfo(name);
}
@GetMapping("show/{pagno}/{pagesize}")
public List<Child> getpage(@PathVariable int pagno,@PathVariable int pagesize){
	return cser.getbypage(pagno, pagesize);
}
@GetMapping("show/{pageno}/{pagesize}/{name}")
public List<Child> getpagesort(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
	return cser.getbypagesort(pageno, pagesize, name);
}

}