package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.Childrep;

@Service
public class Childser {
@Autowired
Childrep cre;
 public List<Child> add(List<Child> c){
	 return (List<Child>) cre.saveAll(c);
 }
 public List<Child> show(){
	 return cre.findAll();
 }
 public Child update(Child c) {
	 return cre.saveAndFlush(c);
 }
 public void deleteid(int id) {
	   cre.deleteById(id);
 }
 public List<Child> sortinfo(String s){
	 return cre.findAll(Sort.by(Sort.Direction.ASC, s));
 }
 public List<Child> getbypage(int pagno,int pagsize){
	 Page<Child> c=cre.findAll(PageRequest.of(pagno, pagsize));
	 return c.getContent();
 }
 public List<Child> getbypagesort(int pagno,int pagsize,String s){
	 Page<Child> c=cre.findAll(PageRequest.of(pagno,pagsize,Sort.by(Sort.Direction.DESC, s)));
	 return c.getContent();
 }
}