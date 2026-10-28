package tasks.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tasks.Task;

public interface  TaskRepository extends JpaRepository<Task, Long>{
    
}