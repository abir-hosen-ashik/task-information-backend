package com.abir.information.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/{id}")
	public Task getTaskById(@PathVariable Long id) {
		return (Task) taskService.getById(id);
	}

	@GetMapping
	public Page<?> getAllTask() {
		return taskService.getAll();
	}

	@PostMapping
	public Task saveTask(@RequestBody Task task) {
		return (Task) taskService.save(task);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable Long id) {
		try {
			taskService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world";
	}

}
