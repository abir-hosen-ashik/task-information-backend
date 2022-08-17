package com.abir.information.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("taskService")
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	private Pageable pageable = PageRequest.of(0, 1000);

	@Override
	public Object getById(Long id) {
		return taskRepository.findById(id).get();
	}
	
	@Override
	public Page<?> getAll() {
		return taskRepository.findAll(pageable);
	}

	@Override
	public Task save(Object object) {
		return taskRepository.save((Task) object);
	}

	@Override
	public void delete(Long id) {
		taskRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		taskRepository.deleteAll();
	}

}
