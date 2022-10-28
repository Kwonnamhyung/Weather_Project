package zerobase.weather_project.Repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather_project.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JdbcMemoRepositoryTest {

    @Autowired
    private JdbcMemoRepository jdbcMemoRepository;

    @Test
    void insertMemoTest(){

        Memo memo = new Memo(1 , "test Memo ");
        jdbcMemoRepository.save(memo);

        Optional<Memo> result = jdbcMemoRepository.findById(memo.getId());
        Assertions.assertEquals(result.get().getId() , 1);

    }

    @Test
    void finAllMemoTest(){

        Memo memo = new Memo(1 , "test Memo ");
        jdbcMemoRepository.save(memo);

        List<Memo> memoList = jdbcMemoRepository.findAll();

        assertNotNull(memoList);
    }



}