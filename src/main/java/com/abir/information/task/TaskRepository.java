package com.abir.information.task;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository("taskRepository")
public interface TaskRepository extends PagingAndSortingRepository<Task, Long>{

}
