package redis.redisinspring.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import redis.redisinspring.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Page<Board> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
