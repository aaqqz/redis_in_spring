package redis.redisinspring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.redisinspring.entity.Board;
import redis.redisinspring.service.BoardService;

import java.util.List;

@RestController
@RequestMapping("boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public List<Board> getBoards(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return boardService.getBoards(page, size);
    }
}
