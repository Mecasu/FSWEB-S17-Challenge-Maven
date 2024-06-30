package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Course;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse {
    private Course course;
    private Integer totalGpa;
}
