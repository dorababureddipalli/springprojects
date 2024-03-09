package com.rootpack.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
	/*
	 * @GetMapping("/welcome") public String welcomeMsg(@RequestParam(value = "msg",
	 * required = false) String s) { String msg = "welcome to " + s; return msg; }
	 * 
	 * @GetMapping("/sDetails") public String welcomeMsg(@RequestParam(value = "id")
	 * Integer id, @RequestParam(value = "name") String name) { return "id " + id +
	 * " name " + name; }
	 * 
	 * @GetMapping("/user/{name}") public String welcomeUser(@PathVariable("name")
	 * String name) { return "welcome to " + name; }
	 */
	/*
	 * @GetMapping(value = "/student", produces = { "application/json",
	 * "application/xml" }) public Student converter(@RequestParam(value = "id")
	 * Integer id) { Student s = new Student();
	 * 
	 * if (id == 101) { s.setId(101); s.setName("dorababu"); s.setSkill("java"); }
	 * else if (id == 102) { s.setId(102); s.setName("veerababu");
	 * s.setSkill("python"); } return s;
	 * 
	 * }
	 */
	

}
