package tasks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tasks.Services.Entities.Task;


public interface  TaskRepository extends JpaRepository<Task, Long>{
    
}