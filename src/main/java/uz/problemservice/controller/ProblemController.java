package uz.problemservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.problemservice.dtos.ProblemCreateDto;
import uz.problemservice.dtos.ProblemResponseDto;
import uz.problemservice.service.ProblemService;

@RestController
@RequestMapping("/api/v1/problems")
@RequiredArgsConstructor
public class ProblemController {
    private final ProblemService problemService;

    @PostMapping("/create")
    public ProblemResponseDto createProblem (@RequestBody ProblemCreateDto dto) {
        return problemService.create(dto);
    }

}
