package lab5.lab5;

import lab5.lab5.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student, Long> {
}
