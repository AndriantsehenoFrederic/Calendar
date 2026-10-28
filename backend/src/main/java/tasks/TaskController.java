package tasks;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tasks")
public class TaskController {
    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Task> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Task creat(@RequestBody Task task) {
        return repository.save(task);
    }
}