package lab5.lab5;

import lab5.lab5.Student;
import lab5.lab5.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private Repository repository;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudent(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        updatedStudent.setId(id);
        return repository.save(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
